package com.boss.train.oss.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.model.GetObjectRequest;
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

    /**
     * 简单文件上传
     * @param newName
     * @param uploadAddress
     */
    @Override
    public void upload(String newName, String uploadAddress) {
        ossClient.putObject(configEntity.getBucketName(), newName, new File(uploadAddress));
        ossClient.shutdown();
    }

    /**
     * 下载文件到本地
     * @param fileName
     * @param downloadAddress
     */
    @Override
    public void download(String fileName, String downloadAddress) {
        ossClient.getObject(new GetObjectRequest(configEntity.getBucketName(), fileName), new File(downloadAddress));
        ossClient.shutdown();
    }
}
