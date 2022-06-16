package com.jpa.service;

import com.jpa.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

    Comment saveComment(Comment comment);

    void  deleteComment(long commentId);
}
