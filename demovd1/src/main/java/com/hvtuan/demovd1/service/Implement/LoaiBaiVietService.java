package com.hvtuan.demovd1.service.Implement;

import com.hvtuan.demovd1.dto.LoaiBaiVietDto;
import com.hvtuan.demovd1.model.LoaiBaiViet;
import com.hvtuan.demovd1.repository.LoaiBaiVietRepository;
import com.hvtuan.demovd1.service.ILoaiBaiVietService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoaiBaiVietService extends BaseService<LoaiBaiViet, LoaiBaiVietDto> implements ILoaiBaiVietService {
    @Autowired
    public LoaiBaiVietService(LoaiBaiVietRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper);
    }
    @Override
    protected Class<LoaiBaiViet> getEntityClass() {
        return LoaiBaiViet.class;
    }

    @Override
    protected Class<LoaiBaiVietDto> getDtoClass() {
        return LoaiBaiVietDto.class;
    }
}
