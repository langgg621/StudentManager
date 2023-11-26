package com.hvtuan.demovd1.service.Implement;

import com.hvtuan.demovd1.dto.LoaiKhoaHocDto;
import com.hvtuan.demovd1.model.LoaiKhoaHoc;
import com.hvtuan.demovd1.repository.LoaiKhoaHocRepository;
import com.hvtuan.demovd1.service.ILoaiKhoaHocService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoaiKhoaHocService extends BaseService<LoaiKhoaHoc, LoaiKhoaHocDto> implements ILoaiKhoaHocService {
    @Autowired
    public LoaiKhoaHocService(LoaiKhoaHocRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper);
    }

    @Override
    protected Class<LoaiKhoaHoc> getEntityClass() {
        return LoaiKhoaHoc.class;
    }

    @Override
    protected Class<LoaiKhoaHocDto> getDtoClass() {
        return LoaiKhoaHocDto.class;
    }
}
