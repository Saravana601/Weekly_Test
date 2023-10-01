package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
