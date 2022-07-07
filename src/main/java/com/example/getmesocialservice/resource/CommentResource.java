package com.example.getmesocialservice.resource;


import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.service.AlbumService;
import com.example.getmesocialservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController  //Spring will understand that there are rest endpoint here
@RequestMapping("/api/comment") //endpoint path. Methods will start with server/api. (Example: http://localhost:8080/api/album)
public class CommentResource {

    @Autowired
    private CommentService cService;


    @PostMapping
    public Comment createComment(@RequestBody Comment c){
        return cService.createComment(c);
    }


    @GetMapping
    public List<Comment> getAllComment() {
        return cService.getAllComment();
    }

    @GetMapping("/findById")
    public Optional<Comment> getCommentById(@RequestParam(name = "commentId") String commentId){
        return cService.getCommentById(commentId);
    }

    @PutMapping
    public Comment updateComment(@RequestBody Comment c){
        return cService.updateComment(c);
    }

    @DeleteMapping
    public void deleteComment(@RequestParam(name = "commentid") String commentId){
        cService.deleteComment(commentId);
    }

}
