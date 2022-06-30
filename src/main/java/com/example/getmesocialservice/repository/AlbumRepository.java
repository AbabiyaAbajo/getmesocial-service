package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    List<Album> albumList = new ArrayList();

    public List<Album> getAllAlbum() {
        return albumList;
    }

    public Album getAlbumById(int albumId) {
        for (Album a:albumList) {
            if(a.getAlbumId() == albumId)
                return a;
        }
        return null;

    }

    public Album createAlbum(Album a) {
        a.setAlbumId(albumList.size()+1);
        albumList.add(a);
        return a;
    }


    public Album updateAlbum(int albumId, Album a) {
        for(Album al:albumList)
            if(al.getAlbumId() == albumId){
                al.setName(a.getName());
                al.setDescription(a.getDescription());
                al.setCoverPicUrl(a.getCoverPicUrl());
                return a;
            }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deleteA = null;
        for(Album a:albumList)
            if(a.getAlbumId() == albumId){
                deleteA = a;
                albumList.remove(a);
                return deleteA;
            }
        return deleteA;
    }
}
