package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.repository.AlbumRepository;
import com.example.getmesocialservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository cRepo;


    public Comment createComment(Comment c) {
        return cRepo.save(c);
    }


    public List<Comment> getAllComment() {
        return cRepo.findAll();
    }

    public Optional<Comment> getCommentById(String commentId) {
        return cRepo.findById(commentId);
    }

    public Comment updateComment(Comment c) {
        return cRepo.save(c);
    }

    public void deleteComment(String commentId) {
        cRepo.deleteById(commentId);
    }
}
