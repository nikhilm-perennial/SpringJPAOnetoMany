package com.jpa.repository;

import com.jpa.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDAO extends JpaRepository<Post,Long> {

    /**
     * Search for Post using Title
     * @param title title to be searched
     * @return
     */
    Post findByTitle(String title);
}
