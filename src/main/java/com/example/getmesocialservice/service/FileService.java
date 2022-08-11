package com.example.getmesocialservice.service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;

import java.io.IOException;

@Service
public class FileService {


    public boolean upload(MultipartFile file) {

        BasicAWSCredentials credentials = new BasicAWSCredentials("AKIA56D5TVTMFEVVZ2PO", "JlTi8P16GPvJMEZGFI6IZQDAczeHy2GNd1I7VeGK");
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials)).withRegion(Regions.US_EAST_1).build();
        try {

            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(file.getSize());
            metadata.setContentType(file.getContentType());

            s3.putObject("backend-s3-gmh", file.getOriginalFilename(), file.getInputStream(), metadata );
            return true;
        } catch (AmazonServiceException | IOException e) {
            e.printStackTrace();
            return false;
        }


    }

    public S3Object getFile(String key) {

        BasicAWSCredentials credentials = new BasicAWSCredentials("AKIA56D5TVTMFEVVZ2PO", "JlTi8P16GPvJMEZGFI6IZQDAczeHy2GNd1I7VeGK");
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials)).withRegion(Regions.US_EAST_1).build();
        return s3.getObject("backend-s3-gmh", key);

    }

    public void deleteFile(String key) {

        BasicAWSCredentials credentials = new BasicAWSCredentials("AKIA56D5TVTMFEVVZ2PO", "JlTi8P16GPvJMEZGFI6IZQDAczeHy2GNd1I7VeGK");
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials)).withRegion(Regions.US_EAST_1).build();
        s3.getObject("backend-s3-gmh", key);

    }
}
