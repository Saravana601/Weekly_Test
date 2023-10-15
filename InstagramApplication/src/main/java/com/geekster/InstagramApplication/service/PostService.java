package com.geekster.InstagramApplication.service;

import com.geekster.InstagramApplication.models.Post;
import com.geekster.InstagramApplication.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    IPostRepository iPostRepository;

    public String addPost(Post post) {

        iPostRepository.save(post);
        return "Posted Successfully";
    }

    public Post getPostById(Long postId) {
        return iPostRepository.findById(postId).orElseThrow();
    }
}
