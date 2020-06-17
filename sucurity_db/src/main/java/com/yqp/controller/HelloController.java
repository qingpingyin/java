package com.yqp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/admin/hello")
    public String admin(){
        return "admin hello";
    }
    @GetMapping("/user/hello")
    public String user(){
        return "user hello";
    }
    @GetMapping("/dba/hello")
    public String dba(){
        return "dba hello";
    }

}
