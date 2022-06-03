package com.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    public Integer postId;
    public String title;
    public String description;

    @OneToMany(mappedBy = "post") //,fetch = FetchType.EAGER,cascade = CascadeType.ALL
    private List<Comment> comment;
}
