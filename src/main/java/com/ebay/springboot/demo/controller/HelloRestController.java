package com.ebay.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!, Time on the server is : " + LocalDateTime.now();
    }
}
