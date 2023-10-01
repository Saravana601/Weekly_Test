package com.geekster.EcommerceAPI.controller;

import com.geekster.EcommerceAPI.model.User;
import com.geekster.EcommerceAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("user/{userID}")
    public User getUserByID(@PathVariable Integer userID){
        return userService.getUserByID(userID);
    }
}
