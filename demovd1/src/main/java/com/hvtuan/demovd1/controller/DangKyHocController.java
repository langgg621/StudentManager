package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.dto.DangKyHocDto;
import com.hvtuan.demovd1.model.DangKyHoc;
import com.hvtuan.demovd1.service.IBaseService;
import com.hvtuan.demovd1.service.IDangKyHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dangkyhoc")
public class DangKyHocController extends BaseController<DangKyHoc, DangKyHocDto> {
    private final IDangKyHocService dangKyHocService;
    @Autowired
    public DangKyHocController(IDangKyHocService dangKyHocService) {
        super(dangKyHocService);
        this.dangKyHocService = dangKyHocService;
    }
}
