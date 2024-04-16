package com.example.uploadfile.repository;

import com.example.uploadfile.entity.Image;
import com.example.uploadfile.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {

    List<Image> findByPost(Post post);
}
