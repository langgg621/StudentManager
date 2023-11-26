package com.hvtuan.demovd1.service.Implement;

import com.hvtuan.demovd1.dto.BaiVietDto;
import com.hvtuan.demovd1.dto.KhoaHocDto;
import com.hvtuan.demovd1.model.BaiViet;
import com.hvtuan.demovd1.model.KhoaHoc;
import com.hvtuan.demovd1.repository.BaiVietRepository;
import com.hvtuan.demovd1.repository.KhoaHocRepository;
import com.hvtuan.demovd1.service.IBaiVietService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BaiVietService extends BaseService<BaiViet,BaiVietDto> implements IBaiVietService {
    @Autowired
    public BaiVietService(BaiVietRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper);
    }

    @Override
    protected Class<BaiViet> getEntityClass() {
        return BaiViet.class;
    }

    @Override
    protected Class<BaiVietDto> getDtoClass() {

        return BaiVietDto.class;
    }

    @Override
    public Page<BaiVietDto> findByTenBaiViet(String tenBaiViet, Pageable pageable) {
        Page<BaiViet> baiVietPage = ((BaiVietRepository)repository).findByTenBaiViet(tenBaiViet, pageable);
        return baiVietPage.map(baiViet -> modelMapper.map(baiViet, BaiVietDto.class));
    }
}
