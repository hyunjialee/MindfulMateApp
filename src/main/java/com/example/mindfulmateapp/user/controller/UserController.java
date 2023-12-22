package com.example.mindfulmateapp.user.controller;

import com.example.mindfulmateapp.user.UserService;
import com.example.mindfulmateapp.user.repository.UserRepository;
import com.example.mindfulmateapp.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public String welcomeUser(){
        return "Hi user";
    }

}
