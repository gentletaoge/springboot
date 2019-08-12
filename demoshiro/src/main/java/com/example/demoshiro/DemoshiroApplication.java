package com.example.demoshiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.mybatis.spring.annotation.MapperScan;

@RestController
@SpringBootApplication
@MapperScan(value = "com.example.demoshiro.dao")
public class DemoshiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoshiroApplication.class, args);
    }

    @RequestMapping ("/")
    String index(){
        return "hello gentletao";
    }
}
