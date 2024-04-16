package com.example.uploadfile.repository;

import com.example.uploadfile.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
