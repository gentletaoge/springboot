package com.example.demomysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@MapperScan("com.example.demomysql.mapper")//扫描的mapper
@SpringBootApplication
public class DemomysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemomysqlApplication.class, args);
    }

    @RequestMapping ("/")
    String index(){
        return "hello gentletao";
    }
}
