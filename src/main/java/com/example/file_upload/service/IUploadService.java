package com.example.file_upload.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IUploadService {

    void saveFile(MultipartFile file) throws IOException;
}
