package com.hvtuan.demovd1.service;

import com.hvtuan.demovd1.dto.BaiVietDto;
import com.hvtuan.demovd1.dto.KhoaHocDto;
import com.hvtuan.demovd1.model.BaiViet;
import com.hvtuan.demovd1.model.KhoaHoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IKhoaHocService extends IBaseService<KhoaHoc, KhoaHocDto>{
    Page<KhoaHocDto> findByTenKhoaHocContaining(String tenKhoaHoc, Pageable pageable);

    // Phân trang dữ liệu
    Page<KhoaHocDto> findAll(Pageable pageable);
}
