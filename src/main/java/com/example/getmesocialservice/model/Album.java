package com.example.getmesocialservice.model;

import com.example.getmesocialservice.validation.ValidName;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Pattern;
import java.util.Date;

public class Album {

    @Id
    private String albumId;
    @Length(max = 10)
    private String name;
    private String coverPicUrl;
//    @Pattern(regexp="[a-z0-9.]+",message="must be in lower case letters and numbers")
    @ValidName(message = "Name must be in lower case")
    private String createdBy;
    private Date dateCreated;

    public Album(@Length(max = 10) String name, String coverPicUrl, @ValidName String createdBy, Date dateCreated) {
        this.name = name;
        this.coverPicUrl = coverPicUrl;
        this.createdBy = createdBy;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }


}
