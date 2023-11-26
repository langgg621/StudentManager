package com.hvtuan.demovd1.service.Implement;

import com.hvtuan.demovd1.dto.DangKyHocDto;
import com.hvtuan.demovd1.model.BaiViet;
import com.hvtuan.demovd1.model.DangKyHoc;
import com.hvtuan.demovd1.repository.DangKyHocRepository;
import com.hvtuan.demovd1.service.IDangKyHocService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DangKyHocService extends BaseService<DangKyHoc, DangKyHocDto> implements IDangKyHocService {
    @Autowired
    public DangKyHocService(DangKyHocRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper);
    }
    @Override
    protected Class<DangKyHoc> getEntityClass() {
        return DangKyHoc.class;
    }

    @Override
    protected Class<DangKyHocDto> getDtoClass() {
        return DangKyHocDto.class;
    }
}
