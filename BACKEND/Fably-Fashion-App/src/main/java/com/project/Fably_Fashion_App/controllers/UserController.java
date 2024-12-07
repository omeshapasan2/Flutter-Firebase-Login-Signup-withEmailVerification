package com.project.Fably_Fashion_App.controllers;

import com.project.Fably_Fashion_App.models.User;
import com.project.Fably_Fashion_App.services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    private ResponseEntity<String> login(@RequestBody User user, HttpSession session){
        return ResponseEntity.ok("Login API end point");
    }

    @RequestMapping("/logout")
    private ResponseEntity<String> logout(HttpSession session){
        session.invalidate();
        return ResponseEntity.ok("Logged out");
    }

    @RequestMapping("/register")
    private ResponseEntity<String> register(@RequestBody User user, HttpSession session){
        return ResponseEntity.ok("Register API end point");
    }

}
