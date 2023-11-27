package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.dto.BaiVietDto;
import com.hvtuan.demovd1.model.BaiViet;
import com.hvtuan.demovd1.service.IBaiVietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/baiviet")
public class BaiVietController extends BaseController<BaiViet, BaiVietDto> {
    private final IBaiVietService baiVietService;
    private static final Path CURRENT_FOLDER = Paths.get(System.getProperty("user.dir"));

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
    @PostMapping(value = "/create")
    public ResponseEntity<BaiVietDto> create(@ModelAttribute BaiVietDto baiVietDto, @RequestParam MultipartFile image) throws Exception {
        Path staticPath = Paths.get("static");
        Path imagePath = Paths.get("/baiviet-images");
        if (!Files.exists(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath))) {
            Files.createDirectories(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath));
        }
        Path file = CURRENT_FOLDER.resolve(staticPath)
                .resolve(imagePath).resolve(image.getOriginalFilename());
        try (OutputStream os = Files.newOutputStream(file)) {
            os.write(image.getBytes());
        }
        baiVietDto.setHinhAnh(imagePath.resolve(image.getOriginalFilename()).toString());
        BaiVietDto baiVietDto1 = baiVietService.add(baiVietDto);
        return new ResponseEntity<>(baiVietDto1,HttpStatus.CREATED);

    }



}
