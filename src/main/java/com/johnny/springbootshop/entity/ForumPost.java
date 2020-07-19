package com.johnny.springbootshop.entity;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "forum_post")
@Data
public class ForumPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "post_name")
    private String postName;

    @Column(name = "created_by")
    private String createdBy;
}
