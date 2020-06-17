package com.yqp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yqp.mapper")
public class SecurityDyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityDyApplication.class, args);
    }

}
