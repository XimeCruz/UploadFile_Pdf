package com.example.file_upload.service;

import com.example.file_upload.beans.EnterezaBean;
import com.example.file_upload.collections.PdfCollection;
import com.example.file_upload.repository.IUploadFileRepository;
import com.example.file_upload.utils.ConstantesErroresPdf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class UploadFileService implements IUploadService{

    private final Logger LOGGER = LoggerFactory.getLogger(UploadFileService.class);

    @Autowired
    private IUploadFileRepository uploadFileRepository;
    //private String upload_folder = ".//src//main//resources//files//";


    @Override
    public EnterezaBean saveFile(String codEmpresa, MultipartFile file){
        EnterezaBean enterezaBean = new EnterezaBean();

        PdfCollection pdfCollection = new PdfCollection();
        if (file.isEmpty()) {
            enterezaBean.setCodeError(ConstantesErroresPdf.CONST_COD_KO.getValue());
            enterezaBean.setMsgError("Seleccione imagen, imagen vacia");
        }
        else {

            try {
                byte[] bytes = file.getBytes();
                pdfCollection.setPdf(bytes);
                pdfCollection.setCodigo_empresa(codEmpresa);
                uploadFileRepository.save(pdfCollection);
                enterezaBean.setCodeError(ConstantesErroresPdf.CONST_COD_OK.getValue());
                enterezaBean.setMsgError("Pdf guardado exitosamente");

                LOGGER.info("El archivo se guardo correctamente en la empresa con id " + codEmpresa);


            } catch (IOException e) {
                enterezaBean.setCodeError(ConstantesErroresPdf.CONST_COD_KO.getValue());
                enterezaBean.setMsgError("Ocurrio un error en el sistema " + e);

                LOGGER.info("Ocurrio un error al guardar el archivo");
            }
        }

        return enterezaBean;

//        if(!file.isEmpty()){
//           byte[] bytes = file.getBytes();
////            Path path = Paths.get(upload_folder + file.getOriginalFilename());
////            Files.write(path,bytes);
//            pdfCollection.setPdf(bytes);
//            uploadFileRepository.save(pdfCollection);
//        }
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
