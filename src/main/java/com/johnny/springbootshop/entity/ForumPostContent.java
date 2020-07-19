package com.johnny.springbootshop.entity;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "forum_post_content")
@Data
public class ForumPostContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "post_content")
    private String postContent;

    @Column(name = "forum_post_id")
    private String forumPostId;

    @Column(name = "created_by")
    private String createdBy;
}