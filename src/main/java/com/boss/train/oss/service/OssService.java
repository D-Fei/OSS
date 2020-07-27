package com.boss.train.oss.service;

public interface OssService {
    /**
     * 简单文件上传
     * @param uploadAddress
     * @param newName
     */
    public void upload(String uploadAddress,String newName);

    /**
     * 下载文件到本地
     * @param fileName
     * @param downloadAddress
     */
    public void download(String fileName, String downloadAddress);

    /**
     * 删除单个文件
     * @param fileName
     */
    public void delete(String fileName);
}
