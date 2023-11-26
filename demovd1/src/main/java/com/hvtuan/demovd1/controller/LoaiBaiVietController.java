package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.dto.LoaiBaiVietDto;
import com.hvtuan.demovd1.model.LoaiBaiViet;
import com.hvtuan.demovd1.service.IBaseService;
import com.hvtuan.demovd1.service.ILoaiBaiVietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/loaibaiviet")
public class LoaiBaiVietController extends BaseController<LoaiBaiViet, LoaiBaiVietDto> {
    private final ILoaiBaiVietService loaiBaiVietService;
    @Autowired
    public LoaiBaiVietController(ILoaiBaiVietService loaiBaiVietService) {
        super(loaiBaiVietService);
        this.loaiBaiVietService = loaiBaiVietService;
    }
}
