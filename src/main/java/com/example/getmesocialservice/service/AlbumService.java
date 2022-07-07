package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //Object already created and doesn't need to be created new object
public class AlbumService {

    @Autowired
    private AlbumRepository aRepo;


    public Album createAlbum(Album a) {
        return aRepo.save(a);
    }

    public List<Album> getAllAlbum() {
        return aRepo.findAll();
    }

    public Optional<Album> getAlbumById(String albumId) {
        return aRepo.findById(albumId);
    }

    public Album updateAlbum(Album a) {
        return aRepo.save(a);
    }

    public void deleteAlbum(String albumId) {
        aRepo.deleteById(albumId);
    }
//
//
//
//    public Album createAlbum(Album a) {
//        return aRepo.createAlbum(a);
//    }
//

}
