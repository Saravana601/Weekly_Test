package com.geekster.InstagramApplication.controller;

import com.geekster.InstagramApplication.models.User;
import com.geekster.InstagramApplication.models.dto.AuthenticationInput;
import com.geekster.InstagramApplication.models.dto.SignInInput;
import com.geekster.InstagramApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("signUp")
    public String userSignUp(@RequestBody User user) {
        return userService.userSignUp(user);
    }

    @PostMapping("signIn")
    public String userSignIn(SignInInput signIn){
        return userService.userSignIn(signIn);
    }

    @PutMapping("user")
    public String updateUserEmailByUserId(@RequestBody AuthenticationInput authenticationInput, @RequestParam String email) {
        return userService.updateUserDetails(authenticationInput,email);
    }

}

