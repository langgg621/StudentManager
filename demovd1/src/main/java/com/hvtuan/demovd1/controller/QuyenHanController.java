package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.dto.QuyenHanDto;
import com.hvtuan.demovd1.model.QuyenHan;
import com.hvtuan.demovd1.service.IBaseService;
import com.hvtuan.demovd1.service.IQuyenHanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/quyenhan")
public class QuyenHanController extends BaseController<QuyenHan, QuyenHanDto> {
    private final IQuyenHanService quyenHanService;
    @Autowired
    public QuyenHanController(IQuyenHanService quyenHanService) {
        super(quyenHanService);
        this.quyenHanService = quyenHanService;
    }
}
