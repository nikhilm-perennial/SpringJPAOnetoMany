package com.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long postId;

    public String title;

    @Column(length = 1500)
    public String description;

    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL,orphanRemoval = true) //,fetch = FetchType.EAGER,cascade = CascadeType.ALL
    private List<Comment> comment;


}
