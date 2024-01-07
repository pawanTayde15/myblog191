package com.myblog.myblog191.repository;

import com.myblog.myblog191.controller.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
