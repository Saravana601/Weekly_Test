package com.geekster.InstagramApplication.repository;

import com.geekster.InstagramApplication.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository<Post,Long> {
}
