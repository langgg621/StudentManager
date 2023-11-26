package com.hvtuan.demovd1.service.Implement;

import com.hvtuan.demovd1.dto.BaiVietDto;
import com.hvtuan.demovd1.dto.HocVienDto;
import com.hvtuan.demovd1.dto.KhoaHocDto;
import com.hvtuan.demovd1.model.BaiViet;
import com.hvtuan.demovd1.model.HocVien;
import com.hvtuan.demovd1.model.KhoaHoc;
import com.hvtuan.demovd1.repository.BaiVietRepository;
import com.hvtuan.demovd1.repository.HocVienRepository;
import com.hvtuan.demovd1.repository.KhoaHocRepository;
import com.hvtuan.demovd1.service.IHocVienService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class HocVienService extends BaseService<HocVien, HocVienDto> implements IHocVienService {
    @Autowired
    public HocVienService(HocVienRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper);
    }

    @Override
    protected Class<HocVien> getEntityClass() {
        return HocVien.class;
    }

    @Override
    protected Class<HocVienDto> getDtoClass() {
        return HocVienDto.class;
    }


    @Override
    public Page<HocVienDto> findAllByHoten(Pageable pageable, String hoTen) {
        Page<HocVien> hocVienPage = ((HocVienRepository)repository).findAllByHoten(pageable, hoTen);
        return hocVienPage.map(hocVien -> modelMapper.map(hocVien, HocVienDto.class));
    }

    @Override
    public Page<HocVienDto> findAllByEmail(Pageable pageable, String email) {
        Page<HocVien> hocVienPage = ((HocVienRepository)repository).findAllByEmail(pageable, email);
        return hocVienPage.map(hocVien -> modelMapper.map(hocVien, HocVienDto.class));
    }


}
