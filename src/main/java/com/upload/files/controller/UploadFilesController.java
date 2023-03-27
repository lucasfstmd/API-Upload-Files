package com.upload.files.controller;

import com.upload.files.service.UploadFilesServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@RestController
@RequestMapping("api/upload")
@Slf4j
@RequiredArgsConstructor
public class UploadFilesController {

    @Autowired
    private final UploadFilesServiceImpl uploadFilesService;

    @PostMapping("/arquivo")
    public ResponseEntity<String> saveFile(@RequestParam("file")MultipartFile file){
        log.info("Recebendo arquivo: ", file.getOriginalFilename());
        var path =  "C:\\Lucas\\GitHub\\UploadFileService\\src\\main\\java\\com\\upload\\files\\assets\\";
        var caminho = path + UUID.randomUUID() + "." + uploadFilesService.extrairExtensão(file.getOriginalFilename());

        log.info("Nome do arquivo: " + caminho);

        try {
            Files.copy(file.getInputStream(), Path.of(caminho), StandardCopyOption.REPLACE_EXISTING);
            return new ResponseEntity<>("{\"Arquivo\": \"carregado com sucesso\"}", HttpStatus.OK);
        } catch (Exception e) {
            log.error("Erro ao processar o aquivo", e);
            return new ResponseEntity<>("{\"Arquivo\": \"erro ao carregar o aquivo\"}", HttpStatus.OK);
        }
    }
}
