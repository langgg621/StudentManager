package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.dto.BaiVietDto;
import com.hvtuan.demovd1.dto.HocVienDto;
import com.hvtuan.demovd1.model.HocVien;
import com.hvtuan.demovd1.service.IBaseService;
import com.hvtuan.demovd1.service.IHocVienService;
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
@RequestMapping("/api/hocvien")
public class HocVienController extends BaseController<HocVien, HocVienDto> {
    private final IHocVienService hocVienService;
    @Autowired
    public HocVienController(IHocVienService hocVienService) {
        super(hocVienService);
        this.hocVienService = hocVienService;
    }
    @GetMapping("/search-by-hoten/{hoTen}/paged")
    public ResponseEntity<Page<HocVienDto>> searchByHoten(@PathVariable String hoTen, Pageable pageable) {
        Page<HocVienDto> hocVienPage = hocVienService.findAllByHoten(pageable, hoTen);

        if (!hocVienPage.isEmpty()) {
            return new ResponseEntity<>(hocVienPage, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint for searching HocVien by email
    @GetMapping("/search-by-email/{email}/paged")
    public ResponseEntity<Page<HocVienDto>> searchByEmail(@PathVariable String email, Pageable pageable) {
        Page<HocVienDto> hocVienPage = hocVienService.findAllByEmail(pageable, email);

        if (!hocVienPage.isEmpty()) {
            return new ResponseEntity<>(hocVienPage, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
