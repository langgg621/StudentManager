package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.dto.BaiVietDto;
import com.hvtuan.demovd1.model.BaiViet;
import com.hvtuan.demovd1.service.IBaiVietService;
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
@RequestMapping("/api/baiviet")
public class BaiVietController extends BaseController<BaiViet, BaiVietDto> {
    private final IBaiVietService baiVietService;
    @Autowired
    public BaiVietController(IBaiVietService baiVietService){
        super(baiVietService);
        this.baiVietService = baiVietService;
    }
    @GetMapping("/search-by-tenbaiviet/{tenBaiViet}/paged")
    public ResponseEntity<Page<BaiVietDto>> findByTenBaiViet(@PathVariable String tenBaiViet, Pageable pageable) {
        Page<BaiVietDto> baiVietDtoPage = baiVietService.findByTenBaiViet(tenBaiViet, pageable);

        if (baiVietDtoPage != null) {
            return new ResponseEntity<>(baiVietDtoPage, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
