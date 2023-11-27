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
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/hocvien")
public class HocVienController extends BaseController<HocVien, HocVienDto> {
    private static final Path CURRENT_FOLDER = Paths.get(System.getProperty("user.dir"));
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
    @PostMapping(value = "/create")
    public ResponseEntity<HocVienDto> create(@ModelAttribute HocVienDto hocVienDto, @RequestParam MultipartFile image) throws IOException{
        Path staticPath = Paths.get("static");
        Path imagePath = Paths.get("hocvien-images");
        if (!Files.exists(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath))) {
            Files.createDirectories(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath));
        }
        Path file = CURRENT_FOLDER.resolve(staticPath)
                .resolve(imagePath).resolve(image.getOriginalFilename());
        try (OutputStream os = Files.newOutputStream(file)) {
            os.write(image.getBytes());
        }
        hocVienDto.setHinhAnh(imagePath.resolve(image.getOriginalFilename()).toString());
        HocVienDto hocVienDto1 = hocVienService.add(hocVienDto);
        return new ResponseEntity<>(hocVienDto1,HttpStatus.CREATED);

    }

}
