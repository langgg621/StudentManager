package com.hvtuan.demovd1;

import com.hvtuan.demovd1.model.TinhTrangHoc;
import com.hvtuan.demovd1.repository.TinhTrangHocRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@RequiredArgsConstructor
public class Demovd1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demovd1Application.class, args);
    }


}
