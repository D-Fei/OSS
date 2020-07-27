package com.boss.train.oss.controller;

import com.boss.train.oss.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@RestController
@RequestMapping("/oss")
public class OssController {
    @Autowired
    OssService ossService;
    @RequestMapping("/upload")
    public void upload(HttpServletRequest request, HttpServletResponse response) {
        String uploadAddress = "C:\\Users\\xpf14561456\\Desktop\\1.png";
        String newName = "1.png";
        ossService.upload(newName, uploadAddress);
    }
}
