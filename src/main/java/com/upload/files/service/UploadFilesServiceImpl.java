package com.upload.files.service;

import org.springframework.stereotype.Service;

@Service
public class UploadFilesServiceImpl implements UploadFilesService{

    @Override
    public String extrairExtensão(String originalFilename) {
        int i = originalFilename.lastIndexOf(".");
        return  originalFilename.substring(i + 1);
    }
}
