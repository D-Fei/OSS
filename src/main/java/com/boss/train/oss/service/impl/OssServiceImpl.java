package com.boss.train.oss.service.impl;

import com.aliyun.oss.OSS;
import com.boss.train.oss.entity.OssConfigEntity;
import com.boss.train.oss.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
@Service
public class OssServiceImpl implements OssService {
    @Autowired
    private OssConfigEntity configEntity;
    @Autowired
    private OSS ossClient;
    @Override
    public void upload(String newName, String uploadAddress) {
        ossClient.putObject(configEntity.getBucketName(), newName, new File(uploadAddress));
        ossClient.shutdown();
    }
}
