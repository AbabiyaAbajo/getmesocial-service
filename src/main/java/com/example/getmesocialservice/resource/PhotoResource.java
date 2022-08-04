package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.service.CommentService;
import com.example.getmesocialservice.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/photo")
public class PhotoResource {

    @Autowired
    private PhotoService pService;


    @PostMapping
    public Photo createPhoto(@RequestBody @Valid Photo p){
        return pService.createPhoto(p);
    }

    @GetMapping
    public List<Photo> getAllPhoto() {
        return pService.getAllPhoto();
    }

    @GetMapping("/findById")
    public Optional<Photo> getPhotoById(@RequestParam(name = "photoId") String photoId){
        return pService.getCommentById(photoId);
    }

    @PutMapping
    public Photo updatePhoto(@RequestBody @Valid Photo p){
        return pService.updatePhoto(p);
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "PhotoId") String photoId){
        pService.deletePhoto(photoId);
    }

}
