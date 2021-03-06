package com.example.getmesocialservice.model;

import org.springframework.data.annotation.Id;

public class Album {

    @Id
    private String albumId;
    private String name;
    private String coverPicUrl;
    private String createdBy;
    private String dateCreated;

    public Album(String name, String createdBy, String coverPicUrl, String dateCreated) {
        this.name = name;
        this.createdBy = createdBy;
        this.coverPicUrl = coverPicUrl;
        this.dateCreated = dateCreated;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
