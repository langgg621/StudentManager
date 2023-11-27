package com.hvtuan.demovd1.service.Implement;

import com.hvtuan.demovd1.dto.HocVienDto;
import com.hvtuan.demovd1.dto.KhoaHocDto;
import com.hvtuan.demovd1.model.BaiViet;
import com.hvtuan.demovd1.model.HocVien;
import com.hvtuan.demovd1.model.KhoaHoc;
import com.hvtuan.demovd1.repository.HocVienRepository;
import com.hvtuan.demovd1.repository.KhoaHocRepository;
import com.hvtuan.demovd1.service.IKhoaHocService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class KhoaHocService extends BaseService<KhoaHoc, KhoaHocDto> implements IKhoaHocService {
    @Autowired
    public KhoaHocService(KhoaHocRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper);
    }



    @Override
    protected Class<KhoaHoc> getEntityClass() {
        return KhoaHoc.class;
    }

    @Override
    protected Class<KhoaHocDto> getDtoClass() {
        return KhoaHocDto.class;
    }
    @Override
    public Page<KhoaHocDto> findByTenKhoaHocContaining(String name, Pageable pageable) {
        Page<KhoaHoc> khoaHocPage = ((KhoaHocRepository)repository).findByTenKhoaHocContaining(name, pageable);
        return khoaHocPage.map(khoaHoc -> modelMapper.map(khoaHoc, KhoaHocDto.class));
    }

    @Override
    public Page<KhoaHocDto> findAll(Pageable pageable) {
        Page<KhoaHoc> khoaHocPage = repository.findAll(pageable);
        return khoaHocPage.map(khoaHoc -> modelMapper.map(khoaHoc, KhoaHocDto.class));
    }


}
