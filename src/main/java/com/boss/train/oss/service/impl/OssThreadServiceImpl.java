package com.boss.train.oss.service.impl;

import com.aliyun.oss.OSS;
import com.boss.train.oss.entity.OssConfigEntity;
import com.boss.train.oss.service.OssThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Service
public class OssThreadServiceImpl implements OssThreadService {
    @Autowired
    private OssConfigEntity configEntity;
    @Autowired
    private OSS ossClient;
    @Override
    public void update() {
        String uploadAddress2 = "C:\\Users\\xpf14561456\\Desktop\\2.png";
        String newName2 = "2.png";
        String uploadAddress3 = "C:\\Users\\xpf14561456\\Desktop\\3.png";
        String newName3 = "3.png";
        ExecutorService fixdThreadPool = Executors.newFixedThreadPool(2);
        fixdThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                ossClient.putObject(configEntity.getBucketName(), newName2, new File(uploadAddress2));
                ossClient.shutdown();
            }
        });
        fixdThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                ossClient.putObject(configEntity.getBucketName(), newName3, new File(uploadAddress3));
                ossClient.shutdown();
            }
        });
    }
}
