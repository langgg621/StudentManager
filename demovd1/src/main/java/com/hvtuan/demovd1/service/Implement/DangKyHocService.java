package com.hvtuan.demovd1.service.Implement;

import com.hvtuan.demovd1.dto.DangKyHocDto;
import com.hvtuan.demovd1.dto.TinhTrangHocDto;
import com.hvtuan.demovd1.model.DangKyHoc;
import com.hvtuan.demovd1.model.KhoaHoc;
import com.hvtuan.demovd1.model.TinhTrangHoc;
import com.hvtuan.demovd1.repository.DangKyHocRepository;
import com.hvtuan.demovd1.repository.KhoaHocRepository;
import com.hvtuan.demovd1.repository.TinhTrangHocRepository;
import com.hvtuan.demovd1.service.IDangKyHocService;
import lombok.val;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Optional;

@Service
public class DangKyHocService extends BaseService<DangKyHoc, DangKyHocDto> implements IDangKyHocService {
    private final KhoaHocService khoaHocService;
    private final TinhTrangHocService tinhTrangHocService;
    @Autowired
    public DangKyHocService(DangKyHocRepository repository, ModelMapper modelMapper, KhoaHocService khoaHocService, TinhTrangHocService tinhTrangHocService){
        super(repository,modelMapper);
        this.khoaHocService = khoaHocService;
        this.tinhTrangHocService = tinhTrangHocService;
    }
    @Override
    protected Class<DangKyHoc> getEntityClass() {
        return DangKyHoc.class;
    }

    @Override
    protected Class<DangKyHocDto> getDtoClass() {
        return DangKyHocDto.class;
    }
    @Override
    public DangKyHocDto add(DangKyHocDto dangKyHocDto) {
        if (dangKyHocDto.getNgayKetThuc().compareTo(dangKyHocDto.getNgayBatDau()) > 0) {
            DangKyHoc dangKyHoc = modelMapper.map(dangKyHocDto, DangKyHoc.class);
            TinhTrangHoc choduyet = new TinhTrangHoc(1, "Chờ duyệt");
            dangKyHoc.setTinhTrangHoc(choduyet);

            // Kiểm tra và cập nhật trạng thái học xong
            checkHocXong(dangKyHoc);
        }
        return null;
    }

    public boolean checkDangHocChinh(String tinhTrangHoc){
        String tinhtranghoc ="Đang học chính";
        return tinhtranghoc.equals(tinhTrangHoc);
    }
    public boolean checkHocXong(DangKyHoc dangKyHoc) {
        Instant thoiGianBatDau = dangKyHoc.getNgayBatDau().toInstant();
        Instant thoiGianKetThuc = dangKyHoc.getNgayKetThuc().toInstant();
        Instant thoiGianHienTai = Instant.now();
        if (thoiGianHienTai.isAfter(thoiGianBatDau) && thoiGianHienTai.isBefore(thoiGianKetThuc)) {
            return false; // Học viên đang học
        } else {
            dangKyHoc.setTinhTrangHoc(tinhTrangHocService.findByTenTinhTrang("Chưa hoàn thành"));
            repository.save(dangKyHoc);
            return true; // Học viên đã nghỉ giữa chừng
        }
    }

    private Date calculateNgayKetThuc(long id) {
        DangKyHoc dangKyHoc = repository.findById(id).get();
        Instant now = Instant.now();
        Instant ngayKetThuc = now.plus(Duration.ofDays(dangKyHoc.getKhoaHoc().getThoiGianHoc()));
        return Date.from(ngayKetThuc);
    }
    @Scheduled(fixedRate = 60000*60*24) // 60,000 milliseconds = 1 minute
    public void tuDongCapNhatTinhTrangHoc() {
        val danhSachDangKyHoc = repository.findAll();

        for (DangKyHoc dangKyHoc : danhSachDangKyHoc) {
            Instant thoiGianKetThuc = dangKyHoc.getNgayKetThuc().toInstant();
            Instant thoiGianHienTai = Instant.now();

            if (thoiGianKetThuc.isBefore(thoiGianHienTai)) {
                Optional<TinhTrangHocDto> tinhTrangHocHocXong = tinhTrangHocService.findByTenTinhTrang("Học xong");
                dangKyHoc.setTinhTrangHoc(tinhTrangHocHocXong);
                repository.save(dangKyHoc);
            }

        }
    }
    @Override
    public DangKyHocDto accept(Long dangKyHocId) {
        DangKyHoc dangKyHoc = repository.findById(dangKyHocId).orElse(null);
        if (dangKyHoc != null) {
            Optional<TinhTrangHocDto> tinhTrangDangHocChinh = tinhTrangHocService.findByTenTinhTrang("Đang học chính");
            dangKyHoc.setTinhTrangHoc(tinhTrangDangHocChinh);
            dangKyHoc.setNgayBatDau(new Date());
            dangKyHoc.setNgayKetThuc(calculateNgayKetThuc(dangKyHocId));
            repository.save(dangKyHoc);
            return modelMapper.map(dangKyHoc, DangKyHocDto.class);
        }
        return null;
    }
    @Override
    public DangKyHocDto refuse(Long dangKyHocId) {
        DangKyHoc dangKyHoc = repository.findById(dangKyHocId).orElse(null);
        if (dangKyHoc != null) {
            Optional<TinhTrangHocDto> tinhTrangDangHocChinh = tinhTrangHocService.findByTenTinhTrang("Chưa hoàn thành");
            dangKyHoc.setTinhTrangHoc(tinhTrangDangHocChinh);
            repository.save(dangKyHoc);
            return modelMapper.map(dangKyHoc, DangKyHocDto.class);
        }
        return null;
    }

}
