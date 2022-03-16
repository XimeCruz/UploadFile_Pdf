package com.example.file_upload.service;

import com.example.file_upload.beans.EnterezaBean;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IUploadService {


    EnterezaBean saveFile(String codEmpresa, MultipartFile file);
}
