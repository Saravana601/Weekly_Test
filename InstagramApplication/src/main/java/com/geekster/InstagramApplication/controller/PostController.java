package com.geekster.InstagramApplication.controller;

import com.geekster.InstagramApplication.models.Post;
import com.geekster.InstagramApplication.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("post")
    public String addPost(@RequestBody Post post){
        return postService.addPost(post);
    }

    @GetMapping("post/{postId}")
    public Post getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }
}
