package com.example.file_upload.controller;

import com.example.file_upload.beans.EnterezaBean;
import com.example.file_upload.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/entereza-pdf")
public class UploadFileController {

    @Autowired
    private UploadFileService uploadFileService;

    @RequestMapping(path = "/upload", method = RequestMethod.POST)
    public ResponseEntity<EnterezaBean> uploadFile(@RequestParam("codigoEmpresa")String codigoEmpresa, @RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(uploadFileService.saveFile(codigoEmpresa,file));
    }

    //@RequestMapping(path = "/download", method = RequestMethod.GET)


}

