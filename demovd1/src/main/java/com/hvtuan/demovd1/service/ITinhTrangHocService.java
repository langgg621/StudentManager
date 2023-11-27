package com.hvtuan.demovd1.service;

import com.hvtuan.demovd1.dto.TinhTrangHocDto;
import com.hvtuan.demovd1.model.TinhTrangHoc;

import java.util.Optional;

public interface ITinhTrangHocService extends IBaseService<TinhTrangHoc, TinhTrangHocDto>{
    public Optional<TinhTrangHocDto> findByTenTinhTrang(String tenTinhTrang);
}
