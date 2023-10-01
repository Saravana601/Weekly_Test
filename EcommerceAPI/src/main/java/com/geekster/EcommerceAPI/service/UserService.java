package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.User;
import com.geekster.EcommerceAPI.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    IUserRepository iUserRepository;

    // Add User
    public String addUser(User user) {
        iUserRepository.save(user);
        return "user added";
    }

    // Get User By userID
    public User getUserByID(Integer userID) {
        return iUserRepository.findById(userID).orElseThrow();
    }
}
