package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.dto.ChuDeDto;
import com.hvtuan.demovd1.model.ChuDe;
import com.hvtuan.demovd1.service.IBaseService;
import com.hvtuan.demovd1.service.IChuDeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chude")
public class ChuDeController extends BaseController<ChuDe, ChuDeDto> {
    private final IChuDeService chuDeService;
    @Autowired
    public ChuDeController(IChuDeService chuDeService) {
        super(chuDeService);
        this.chuDeService = chuDeService;
    }
    @GetMapping("/all-by-loaibaiviet/{loaiBaiVietId}/paged")
    public ResponseEntity<Page<ChuDeDto>> getAllByLoaiBaiVietId(@PathVariable long loaiBaiVietId, Pageable pageable) {
        Page<ChuDeDto> chuDePage = chuDeService.getAllByLoaiBaiVietId(loaiBaiVietId, pageable);

        if (!chuDePage.isEmpty()) {
            return new ResponseEntity<>(chuDePage, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
