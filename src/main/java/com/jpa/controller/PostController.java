package com.jpa.controller;

import com.jpa.model.Post;
import com.jpa.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/posts")
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }

    @PostMapping("/posts")
    public Post savePost(@RequestBody Post post){
        return postService.savePost(post);
    }

    @GetMapping("/posts/{postId}")
    public Post getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }

//    @GetMapping("/posts/title")   localhost:8005/posts/title?title=frameworks
//    public Post getPostByTitle(@RequestParam String title){
//        return  postService.getPostByTitle(title);
//    }

    @GetMapping("/posts/title/{title}")
    public Post getPostByTitle(@PathVariable String title){
        return  postService.getPostByTitle(title);
    }

    @DeleteMapping("/posts/{postId}")
    public void deletePost(@PathVariable Long postId){
        postService.deletePost(postId);
    }
}
