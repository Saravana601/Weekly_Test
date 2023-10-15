package com.geekster.InstagramApplication.repository;

import com.geekster.InstagramApplication.models.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepository extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByTokenValue(String tokenValue);
}
