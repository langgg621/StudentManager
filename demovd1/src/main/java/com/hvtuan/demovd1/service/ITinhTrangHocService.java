package com.hvtuan.demovd1.service;

import com.hvtuan.demovd1.dto.TinhTrangHocDto;
import com.hvtuan.demovd1.model.HocVien;
import com.hvtuan.demovd1.model.TinhTrangHoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ITinhTrangHocService extends IBaseService<TinhTrangHoc, TinhTrangHocDto>{
    public Optional<TinhTrangHocDto> findByTenTinhTrang(String tenTinhTrang);
}
