package com.jpa.controller;

import com.jpa.model.Comment;
import com.jpa.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/comments")
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @DeleteMapping("/comments/{commentId}")
    public void deleteComment(@PathVariable String commentId){
        commentService.deleteComment(Long.parseLong(commentId));
    }
}
