package com.example.file_upload.repository;

import com.example.file_upload.collections.PdfCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUploadFileRepository extends MongoRepository<PdfCollection, String> {

}
