package com.yqp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.yqp.mapper")
public class SucurityDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SucurityDbApplication.class, args);
    }

}
