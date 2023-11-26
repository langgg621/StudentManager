package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.dto.TaiKhoanDto;
import com.hvtuan.demovd1.model.TaiKhoan;
import com.hvtuan.demovd1.repository.TaiKhoanRepository;
import com.hvtuan.demovd1.service.IBaseService;
import com.hvtuan.demovd1.service.ITaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/taikhoan")
public class TaiKhoanController extends BaseController<TaiKhoan, TaiKhoanDto> {
    private final ITaiKhoanService taiKhoanService;
    @Autowired
    public TaiKhoanController(ITaiKhoanService taiKhoanService) {
        super(taiKhoanService);
        this.taiKhoanService = taiKhoanService;
    }
    @GetMapping("/all-by-taikhoan/{taiKhoan}/paged")
    public ResponseEntity<Page<TaiKhoanDto>> findAllByTaiKhoan(@PathVariable String taiKhoan, Pageable pageable) {
        Page<TaiKhoanDto> taiKhoanPage = taiKhoanService.findAllByTaiKhoan(taiKhoan, pageable);

        if (!taiKhoanPage.isEmpty()) {
            return new ResponseEntity<>(taiKhoanPage, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
