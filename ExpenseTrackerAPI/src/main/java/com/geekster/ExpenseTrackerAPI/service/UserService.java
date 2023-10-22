package com.geekster.ExpenseTrackerAPI.service;

import com.geekster.ExpenseTrackerAPI.model.dto.SignInDto;
import com.geekster.ExpenseTrackerAPI.model.Authentication;
import com.geekster.ExpenseTrackerAPI.model.User;
import com.geekster.ExpenseTrackerAPI.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserService {

    @Autowired
    IUserRepository iUserRepository;

    @Autowired
    AuthenticationService authenticationService;

    // User sign up - new user
    public String userSignUp(User user) {
        // finds user by their email I'd
        User existingUser = iUserRepository.findByEmail(user.getEmail());

        // Check's user already sign up or not
        if(existingUser != null){
            return "You're already signed up. Please sign in";
        }

        String password = user.getPassword();
        try {
            // Encrypt user password using MD5 algorithm
            String encryptedPassword = PasswordEncryptor.encrypt(password);

            // set encrypted password at user password
            user.setPassword(encryptedPassword);

            // Save user to database
            iUserRepository.save(user);
            return "Signed up successfully";
        } catch (NoSuchAlgorithmException e) {
            return "Internal Server error. Try again later";
        }
    }

    // User sign in - those who already sign up
    public String userSignIn(SignInDto signInDto) {
        // finds user by their email I'd
        User existingUser = iUserRepository.findByEmail(signInDto.getEmail());

        // Check's user already sign up or not
        if(existingUser == null){
            return "Please sign up first";
        }

        String password = signInDto.getPassword();

        try {
            // Encrypt user password using MD5 algorithm
            String encryptedPassword = PasswordEncryptor.encrypt(password);

            // checks the user password matches or not
            if(!encryptedPassword.equals(existingUser.getPassword())) {
                return "User credentials are incorrect";
            }

            // create token
            Authentication token = new Authentication(existingUser);
            authenticationService.createToken(token);
            // send token to user mail
            //EmailHandler.sendMail(signInDto.getEmail(),"Token for further use",token.getTokenValue());
            return "Signed in successfully. Check your email for token";
        } catch (NoSuchAlgorithmException e) {
            return "Internal server error";
        }
    }

    // User sign out - those who has valid token can only sign out
    public String userSignOut(String email, String tokenValue) {
        if(authenticationService.authenticate(email,tokenValue)) {
            authenticationService.deleteToken(tokenValue);

            return "Signed out successfully";
        }
        else {
            return "Un Authorized access";
        }
    }
}
