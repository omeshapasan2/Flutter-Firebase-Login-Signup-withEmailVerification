package com.project.Fably_Fashion_App.services;


import com.project.Fably_Fashion_App.models.User;
import com.project.Fably_Fashion_App.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    private String login(User user) {
        return "login service";
    }

    private String register(User user) {
        user.setPassword(PasswordHasher.hash(user.getPassword()));
        // Set password to the encrypted version.
        return "register service";
    }

}
