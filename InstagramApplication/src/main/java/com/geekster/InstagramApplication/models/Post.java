package com.geekster.InstagramApplication.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private String postData;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
