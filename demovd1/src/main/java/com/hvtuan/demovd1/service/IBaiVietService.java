package com.hvtuan.demovd1.service;

import com.hvtuan.demovd1.dto.BaiVietDto;
import com.hvtuan.demovd1.model.BaiViet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBaiVietService extends IBaseService<BaiViet, BaiVietDto> {
    public Page<BaiVietDto> findByTenBaiViet(String tenBaiViet, Pageable pageable);
}
