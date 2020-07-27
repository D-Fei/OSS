package com.boss.train.oss.controller;

import com.boss.train.oss.service.OssThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/ossThread")
public class OssThreadController {
    @Autowired
    OssThreadService ossThreadService;
    @RequestMapping("/upload")
    public void upload() {
        ossThreadService.update();
    }
}
