package com.jpa.repository;

import com.jpa.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDAO extends JpaRepository<Comment,Long> {

}
