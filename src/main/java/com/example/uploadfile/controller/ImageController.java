package com.example.uploadfile.controller;

import com.example.uploadfile.entity.Image;
import com.example.uploadfile.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/v1/images")
@RequiredArgsConstructor
public class ImageController {
    private final ImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        return imageService.uploadImage(file);
    }

    @GetMapping("/{postId}")
    public List<Image> getImagesByPostId(@PathVariable("postId") Long postId) {
        return imageService.getImagesByPostId(postId);
    }

}
