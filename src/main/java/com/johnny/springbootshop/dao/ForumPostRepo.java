package com.johnny.springbootshop.dao;

import com.johnny.springbootshop.entity.ForumPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
public interface ForumPostRepo extends JpaRepository<ForumPost, Long> {
    Page<ForumPost> findByCreatedByContaining(@RequestParam("created_by") String createdBy, Pageable pageable);
}