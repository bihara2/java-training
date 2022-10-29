package com.bihara.spring.boot.docker.demo.springbootdockerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @RequestMapping("/")
    public String homeText() {
        return "Welcome !!!! This Application is running on Docker!!!";
    }

    @RequestMapping("/home")
    public String welcomeText() {
        return "Welcome to Docker demo application using Spring Boot";
    }
}
