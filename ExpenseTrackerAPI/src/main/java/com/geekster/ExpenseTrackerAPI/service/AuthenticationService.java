package com.geekster.ExpenseTrackerAPI.service;

import com.geekster.ExpenseTrackerAPI.model.Authentication;
import com.geekster.ExpenseTrackerAPI.repository.IAuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    IAuthenticationRepository iAuthenticationRepository;


    // Create token
    public void createToken(Authentication token) {
        iAuthenticationRepository.save(token);
    }

    // Authenticate Token
    public boolean authenticate(String email, String tokenValue) {

        Authentication token = iAuthenticationRepository.findByTokenValue(tokenValue);

        return token != null && email.equals(token.getUser().getEmail());
    }

    // delete token
    public void deleteToken(String tokenValue) {
        Authentication token = iAuthenticationRepository.findByTokenValue(tokenValue);
        iAuthenticationRepository.delete(token);
    }
}
