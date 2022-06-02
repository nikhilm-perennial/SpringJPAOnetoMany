package com.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    private Long id;
    private String text;

    @ManyToOne
    @JoinColumn(referencedColumnName = "postId", name = "post_id")
    private Post post;


}
