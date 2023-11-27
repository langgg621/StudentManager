package com.hvtuan.demovd1.service;

import com.hvtuan.demovd1.dto.TaiKhoanDto;
import com.hvtuan.demovd1.model.TaiKhoan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ITaiKhoanService extends IBaseService<TaiKhoan,TaiKhoanDto>{
    public Page<TaiKhoanDto> findAllByTaiKhoan(String taiKhoan, Pageable pageable);
    boolean checkMatKhau(String matKhau);

}
