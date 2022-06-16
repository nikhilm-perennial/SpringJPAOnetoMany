package com.jpa.service;

import com.jpa.model.Comment;
import com.jpa.model.Post;
import com.jpa.repository.CommentDAO;
import com.jpa.repository.PostDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentDAO commentDAO;

    @Override
    public Comment saveComment(Comment comment) {
        return commentDAO.save(comment);
    }

    @Override
    public void deleteComment(long commentId) {
        Comment comment = commentDAO.findById(commentId).get();
        commentDAO.delete(comment);
    }
}
