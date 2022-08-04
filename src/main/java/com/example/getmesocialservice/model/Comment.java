package com.example.getmesocialservice.model;

import com.example.getmesocialservice.validation.ValidName;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class Comment {

    @Id
    private String Id;
    private String photoId;
    @Min(value = 5)
    private String message;
//    @Pattern(regexp="^[a-z0-9]",message="must be in lower case letters and numbers")
    @ValidName(message = "must be in lower case letters and numbers")
    private String createdBy;
    private Date dateCreated;

    public Comment(@Min(value = 5) String message, @ValidName(message = "must be in lower case letters and numbers") String createdBy, Date dateCreated) {
        this.message = message;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
