package com.hvtuan.demovd1.service;

import com.hvtuan.demovd1.dto.ChuDeDto;
import com.hvtuan.demovd1.model.ChuDe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IChuDeService extends IBaseService<ChuDe, ChuDeDto>{
    public Page<ChuDeDto> getAllByLoaiBaiVietId(long loaiBaiVietId, Pageable pageable);
}
