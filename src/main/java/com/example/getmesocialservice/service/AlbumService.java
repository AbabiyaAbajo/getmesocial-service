package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service //Object already created and doesn't need to be created new object
public class AlbumService {

    @Autowired
    private AlbumRepository aRepo;

    public List<Album> getAllAlbum() {
        return aRepo.getAllAlbum();
    }

    public Album getAlbumById(int albumId) {
        return aRepo.getAlbumById(albumId);
    }

    public Album createAlbum(Album a) {
        return aRepo.createAlbum(a);
    }

    public Album updateAlbum(int albumId, Album a) {
        return aRepo.updateAlbum(albumId, a);
    }

    public Album deleteAlbum(int albumId) {
        return aRepo.deleteAlbum(albumId);
    }
}
