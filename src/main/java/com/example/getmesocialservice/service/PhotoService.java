package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository pRepo;

    public Photo createPhoto(Photo p) {
        return pRepo.save(p);
    }

    public List<Photo> getAllPhoto() {
        return pRepo.findAll();
    }

    public Optional<Photo> getCommentById(String photoId) {
        return pRepo.findById(photoId);
    }

    public Photo updatePhoto(Photo p) {
        return pRepo.save(p);
    }

    public void deletePhoto(String photoId) {
        pRepo.deleteById(photoId);
    }
}
