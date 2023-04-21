package com.ebay.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloRestController {

    @Value("${some.envvar}")
    private String envVar;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!, Time on the server is : " + LocalDateTime.now() + "-->" + envVar;
    }
}
