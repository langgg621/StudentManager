package com.hvtuan.demovd1.service;

import com.hvtuan.demovd1.dto.BaiVietDto;
import com.hvtuan.demovd1.dto.HocVienDto;
import com.hvtuan.demovd1.model.BaiViet;
import com.hvtuan.demovd1.model.HocVien;
import com.hvtuan.demovd1.model.KhoaHoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IHocVienService extends IBaseService<HocVien, HocVienDto>{
    public Page<HocVienDto> findAllByHoten(Pageable pageable,String hoTen);
    public Page<HocVienDto> findAllByEmail(Pageable pageable,String email);
}
