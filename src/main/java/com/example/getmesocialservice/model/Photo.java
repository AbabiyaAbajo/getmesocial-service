package com.example.getmesocialservice.model;

import com.example.getmesocialservice.validation.ValidName;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Pattern;
import java.util.Date;

public class Photo {

    @Id
    private String photoId;
    private String albumId;
    private String photoUrl;
//    @Pattern(regexp="^[a-z0-9]",message="must be in lower case letters and numbers")
    @ValidName(message = "must be in lower case letters and numbers")
    private String createdBy;
    private Date dateCreated;

    public Photo(String photoUrl, String createdBy) {
        this.photoUrl = photoUrl;
        this.createdBy = createdBy;

    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }


}
