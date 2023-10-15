package com.geekster.InstagramApplication.service;

import com.geekster.InstagramApplication.models.AuthenticationToken;
import com.geekster.InstagramApplication.models.User;
import com.geekster.InstagramApplication.models.dto.AuthenticationInput;
import com.geekster.InstagramApplication.models.dto.SignInInput;
import com.geekster.InstagramApplication.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserService {

    @Autowired
    IUserRepository iUserRepository;

    @Autowired
    TokenService tokenService;

    // Sign up
    public String userSignUp(User user) {
        String existingEmail = user.getEmail();
        User existingUser = iUserRepository.findFirstByEmail(existingEmail);

        if(existingUser != null){
            return "You're already signed Up. Please sign in";
        }

        String password = user.getPassword();
        try{
            String encryptedPassword = PasswordEncryptor.encrypt(password);

            user.setPassword(encryptedPassword);
            iUserRepository.save(user);
            return "Signed up successfully";
        } catch (NoSuchAlgorithmException e) {
            return "Something went wrong please try again later!";
        }
    }

    // Sign In
    public String userSignIn(SignInInput signIn) {
        User existingUser = iUserRepository.findFirstByEmail(signIn.getEmail());

        if(existingUser == null){
            return "Please sign up first";
        }

        String signInPassword = signIn.getPassword();
        try {
            String encryptSignInPassword = PasswordEncryptor.encrypt(signInPassword);
            if(encryptSignInPassword.equals(existingUser.getPassword())){
                AuthenticationToken token = new AuthenticationToken(existingUser);
                tokenService.createToken(token);
                return token.getTokenValue();
            }
            else{
                return "Sign in credentials are incorrect";
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // Update user email
    public String updateUserDetails(AuthenticationInput authenticationInput, String email) {
        if(tokenService.authenticate(authenticationInput)){
            User existingUser = iUserRepository.findFirstByEmail(authenticationInput.getEmail());
            existingUser.setEmail(email);
            iUserRepository.save(existingUser);
            return "Email updated successfully";
        }
        return "You've to sign to update info";
    }
}
