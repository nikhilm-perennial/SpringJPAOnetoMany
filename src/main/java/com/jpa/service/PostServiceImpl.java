package com.jpa.service;

import com.jpa.model.Post;
import com.jpa.repository.PostDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDAO postDAO;

    /**
     * Display all Post
     * @return
     */
    @Override
    public List<Post> getAllPost() {
        return postDAO.findAll();
    }

    /**
     * Search Post by postId
     * @param postId postid to be searched
     * @return
     */
    @Override
    public Post getPostById(long postId) {
        return postDAO.findById(postId).get();
    }

    /**
     * Serach Post by post title
     * @param title post title to be searched
     * @return
     */
    @Override
    public Post getPostByTitle(String title) {
        return postDAO.findByTitle(title);
    }

    /**
     * Save Post in database
     * @param post post to be save in db
     * @return
     */
    @Override
    public Post savePost(Post post) {
        return postDAO.save(post);
    }

    /**
     * Delete post
     * @param postId delete post using postId
     */
    @Override
    public void deletePost(long postId) {
        Post post = postDAO.findById(postId).get();
        postDAO.delete(post);
    }
}
