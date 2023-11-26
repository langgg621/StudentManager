package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.dto.TinhTrangHocDto;
import com.hvtuan.demovd1.model.TinhTrangHoc;
import com.hvtuan.demovd1.service.IBaseService;
import com.hvtuan.demovd1.service.ITinhTrangHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/tinhtranghoc")
public class TinhTrangHocController extends  BaseController<TinhTrangHoc, TinhTrangHocDto> {
    private final ITinhTrangHocService tinhTrangHocService;
    @Autowired
    public TinhTrangHocController(ITinhTrangHocService tinhTrangHocService) {
        super(tinhTrangHocService);
        this.tinhTrangHocService = tinhTrangHocService;
    }
    @GetMapping("/by-tentinhtrang/{tenTinhTrang}/paged")
    public ResponseEntity<TinhTrangHocDto> findByTenTinhTrang(@PathVariable String tenTinhTrang) {
        Optional<TinhTrangHocDto> tinhTrangHocDto = tinhTrangHocService.findByTenTinhTrang(tenTinhTrang);

        return tinhTrangHocDto
                .map(dto -> new ResponseEntity<>(dto, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
