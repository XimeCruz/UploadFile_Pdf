package com.example.file_upload.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.Binary;
import org.springframework.web.multipart.MultipartFile;

@Document(collection="empresas-collection")
public class PdfCollection {

    @Id
    private String id;
    private String codigo_empresa;
    private byte[] pdf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo_empresa() {
        return codigo_empresa;
    }

    public void setCodigo_empresa(String codigo_empresa) {
        this.codigo_empresa = codigo_empresa;
    }


    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }
}
