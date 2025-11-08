package com.abhi.billing_app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello Abhi, your Spring Boot app is running!";
    }
}
