package com.geekster.InstagramApplication.service;


import com.geekster.InstagramApplication.models.AuthenticationToken;
import com.geekster.InstagramApplication.models.dto.AuthenticationInput;
import com.geekster.InstagramApplication.repository.ITokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Autowired
    ITokenRepository iAuthenticationRepository;

    public void createToken(AuthenticationToken token) {
        iAuthenticationRepository.save(token);
    }

    public boolean authenticate(AuthenticationInput authenticationInput) {
        String existingEmail = authenticationInput.getEmail();
        String tokenValue = authenticationInput.getTokenValue();

        AuthenticationToken token = iAuthenticationRepository.findFirstByTokenValue(tokenValue);

        if(token != null){
            return token.getUser().getEmail().equals(existingEmail);
        }
        return false;
    }
}

