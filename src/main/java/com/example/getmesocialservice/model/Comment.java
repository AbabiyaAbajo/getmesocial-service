package com.example.getmesocialservice.model;

import org.springframework.data.annotation.Id;

public class Comment {

    @Id
    private String Id;
    private String photoId;

    public Comment() {

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }
}
