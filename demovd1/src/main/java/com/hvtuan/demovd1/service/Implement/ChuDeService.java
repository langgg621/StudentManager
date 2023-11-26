package com.hvtuan.demovd1.service.Implement;

import com.hvtuan.demovd1.model.ChuDe;
import com.hvtuan.demovd1.dto.ChuDeDto;
import com.hvtuan.demovd1.model.LoaiBaiViet;
import com.hvtuan.demovd1.repository.ChuDeRepository;
import com.hvtuan.demovd1.repository.LoaiBaiVietRepository;
import com.hvtuan.demovd1.service.IChuDeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class ChuDeService extends BaseService<ChuDe, ChuDeDto> implements IChuDeService {

    @Autowired
    private LoaiBaiVietRepository loaiBaiVietRepository;

    @Autowired
    public ChuDeService(ChuDeRepository chuDeRepository, ModelMapper modelMapper) {
        super(chuDeRepository, modelMapper);
    }

    @Override
    protected Class<ChuDe> getEntityClass() {
        return ChuDe.class;
    }

    @Override
    protected Class<ChuDeDto> getDtoClass() {
        return ChuDeDto.class;
    }

    @Override
    public Page<ChuDeDto> getAllByLoaiBaiVietId(long loaiBaiVietId, Pageable pageable) {
        Page<ChuDe> chuDePage = ((ChuDeRepository) repository).findAllByLoaiBaiVietId(loaiBaiVietId, pageable);
        return chuDePage.map(chuDe -> modelMapper.map(chuDe, ChuDeDto.class));
    }
}
