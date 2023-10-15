package com.geekster.InstagramApplication.repository;

import com.geekster.InstagramApplication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
    User findFirstByEmail(String existingEmail);
}
