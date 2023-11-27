package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.dto.DangKyHocDto;
import com.hvtuan.demovd1.model.DangKyHoc;
import com.hvtuan.demovd1.service.IBaseService;
import com.hvtuan.demovd1.service.IDangKyHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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
    @PutMapping("/accept/{dangKyHocId}")
    public ResponseEntity<DangKyHocDto> acceptDangKyHoc(@PathVariable Long dangKyHocId) {
        DangKyHocDto result = dangKyHocService.accept(dangKyHocId);
        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint để từ chối đăng ký học
    @PutMapping("/refuse/{dangKyHocId}")
    public ResponseEntity<DangKyHocDto> refuseDangKyHoc(@PathVariable Long dangKyHocId) {
        DangKyHocDto result = dangKyHocService.refuse(dangKyHocId);
        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
