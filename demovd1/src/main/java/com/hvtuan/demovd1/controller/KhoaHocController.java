package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.dto.HocVienDto;
import com.hvtuan.demovd1.dto.KhoaHocDto;
import com.hvtuan.demovd1.model.KhoaHoc;
import com.hvtuan.demovd1.service.IKhoaHocService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/khoahoc")
public class KhoaHocController extends BaseController<KhoaHoc, KhoaHocDto> {
    private final IKhoaHocService khoaHocService;
    @Autowired
    public KhoaHocController(IKhoaHocService khoaHocService, IKhoaHocService khoaHocService1) {
        super(khoaHocService);
        this.khoaHocService = khoaHocService1;
    }
    @GetMapping("/all")
    public ResponseEntity<Page<KhoaHocDto>> getAllKhoaHoc(Pageable pageable) {
        Page<KhoaHocDto> khoaHocDtos = khoaHocService.findAll(pageable);
        return new ResponseEntity<>(khoaHocDtos, HttpStatus.OK);
    }

    @GetMapping("/search-by-tenkhoahoc/{name}/paged")
    public ResponseEntity<Page<KhoaHocDto>> findByTenKhoaHoc(@PathVariable String name, Pageable pageable) {
        Page<KhoaHocDto> khoaHocDtos = khoaHocService.findByTenKhoaHocContaining(name, pageable);

        if (khoaHocDtos != null && khoaHocDtos.hasContent()) {
            return new ResponseEntity<>(khoaHocDtos, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
