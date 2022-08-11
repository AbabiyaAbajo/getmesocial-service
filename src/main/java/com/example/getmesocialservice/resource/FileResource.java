package com.example.getmesocialservice.resource;

import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.S3Object;
import com.example.getmesocialservice.service.FileService;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/api/files")
public class FileResource {

    @Autowired
    private FileService fileSer;

    @PostMapping
    public boolean upload(@RequestParam(name = "file")MultipartFile file) {
        return fileSer.upload(file);
    }

    /*
    Key is the file name. In S3 file name are called key
     */
    @GetMapping
    public void view(@RequestParam(name = "key")String key, HttpServletResponse response) throws IOException {
        S3Object obj = fileSer.getFile((key));
        response.setContentType(obj.getObjectMetadata().getContentType());
        response.getOutputStream().write(obj.getObjectContent().readAllBytes());

    }

    @GetMapping("/download")
    public ResponseEntity<ByteArrayResource> download(@RequestParam(name = "key")String key) throws IOException {
        S3Object obj = fileSer.getFile((key));

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(obj.getObjectMetadata().getContentType()))
                .header(Headers.CONTENT_DISPOSITION, "attachment; filename=\"" + key +"\"")
                .body(new ByteArrayResource(obj.getObjectContent().readAllBytes()));

    }

    @DeleteMapping
    public void delete(@RequestParam(name = "file")String key) {
        fileSer.deleteFile(key);
    }

}
