package com.example.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ManAgerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManAgerApplication.class, args);
    }

    @GetMapping("/")
    // 健康检查的接口
    public String health() {
        return "SUCCESS";
    }

}
