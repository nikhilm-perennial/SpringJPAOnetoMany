package com.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commentId;

    @Column(length = 1000)
    private String text;

    @ManyToOne
   // @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(referencedColumnName = "postId", name = "post_id")
    private Post post;

    public Long getCommentId() {
        return commentId;
    }

    public String getText() {
        return text;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", text='" + text + '\'' +
                ", post=" + post +
                '}';
    }
}
