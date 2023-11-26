package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.dto.LoaiKhoaHocDto;
import com.hvtuan.demovd1.model.LoaiKhoaHoc;
import com.hvtuan.demovd1.service.IBaseService;
import com.hvtuan.demovd1.service.ILoaiKhoaHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/loaikhoahoc")
public class LoaiKhoaHocController extends BaseController<LoaiKhoaHoc, LoaiKhoaHocDto> {
    private final ILoaiKhoaHocService loaiKhoaHocService;
    @Autowired
    public LoaiKhoaHocController(ILoaiKhoaHocService loaiKhoaHocService){
        super(loaiKhoaHocService);
        this.loaiKhoaHocService = loaiKhoaHocService;
    }
}
