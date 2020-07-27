package com.boss.train.oss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/oss")
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("hello");
        return "hello";
    }
}
