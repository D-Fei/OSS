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

    /**
     * 简单文件上传
     * @param request
     * @param response
     */
    @RequestMapping("/upload")
    public void upload(HttpServletRequest request, HttpServletResponse response) {
        String uploadAddress = "C:\\Users\\xpf14561456\\Desktop\\1.png";
        String newName = "1.png";
        ossService.upload(newName, uploadAddress);
    }

    /**
     * 下载文件到本地
     */
    @RequestMapping("/download")
    public void download() {
        String downloadAddress = "C:\\Users\\xpf14561456\\Desktop\\download\\1.png";
        String fileName = "1.png";
        ossService.download(fileName,downloadAddress);
    }

    /**
     * 删除单个文件
     */
    @RequestMapping("/delete")
    public void delete() {
        String fileName = "1.png";
        ossService.delete(fileName);
    }
}
