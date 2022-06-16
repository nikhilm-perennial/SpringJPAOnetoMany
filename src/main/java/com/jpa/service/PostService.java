package com.jpa.service;

import com.jpa.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {


    List<Post> getAllPost();


    Post getPostById(long postId);


    Post getPostByTitle(String title);


    Post savePost(Post post);


    void deletePost(long postId);

}
