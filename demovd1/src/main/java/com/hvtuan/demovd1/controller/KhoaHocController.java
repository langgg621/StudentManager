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
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/khoahoc")
public class KhoaHocController extends BaseController<KhoaHoc, KhoaHocDto> {
    private final IKhoaHocService khoaHocService;
    private static final Path CURRENT_FOLDER = Paths.get(System.getProperty("user.dir"));

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
    @PostMapping(value = "/create")
    public ResponseEntity<KhoaHocDto> create(@ModelAttribute KhoaHocDto khoaHocDto, @RequestParam MultipartFile image) throws IOException {
        Path staticPath = Paths.get("static");
        Path imagePath = Paths.get("khoahoc-images");
        if (!Files.exists(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath))) {
            Files.createDirectories(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath));
        }
        Path file = CURRENT_FOLDER.resolve(staticPath)
                .resolve(imagePath).resolve(image.getOriginalFilename());
        try (OutputStream os = Files.newOutputStream(file)) {
            os.write(image.getBytes());
        }
        khoaHocDto.setHinhAnh(imagePath.resolve(image.getOriginalFilename()).toString());
        KhoaHocDto khoaHocDto1 = khoaHocService.add(khoaHocDto);
        return new ResponseEntity<>(khoaHocDto1,HttpStatus.CREATED);

    }


}
