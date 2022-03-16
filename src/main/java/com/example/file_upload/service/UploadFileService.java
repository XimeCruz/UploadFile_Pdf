package com.example.file_upload.service;

import com.example.file_upload.collections.PdfCollection;
import com.example.file_upload.repository.IUploadFileRepository;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class UploadFileService implements IUploadService{

    @Autowired
    private IUploadFileRepository uploadFileRepository;
    //private String upload_folder = ".//src//main//resources//files//";


    @Override
    public void saveFile(MultipartFile file) throws IOException {
        PdfCollection pdfCollection = new PdfCollection();

        if(!file.isEmpty()){
           byte[] bytes = file.getBytes();
//            Path path = Paths.get(upload_folder + file.getOriginalFilename());
//            Files.write(path,bytes);
            pdfCollection.setPdf(bytes);
            uploadFileRepository.save(pdfCollection);
        }
    }

//    @Override
//    public void saveFile(MultipartFile file) throws IOException {
//        if(!file.isEmpty()){
//            byte[] bytes = file.getBytes();
//            Path path = Paths.get(upload_folder + file.getOriginalFilename());
//            Files.write(path,bytes);
//        }
//    }
}
