package com.example.mindfulmateapp.user.controller;

import com.example.mindfulmateapp.user.UserService;
import com.example.mindfulmateapp.user.mapper.UserRequestDTO;
import com.example.mindfulmateapp.user.repository.UserRepository;
import com.example.mindfulmateapp.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
//
//    @GetMapping("/users{id}")
//    public UserRequestDTO show(@PathVariable String id ) {
//        int userID = Integer.parseInt(id);
//        return userService.findUserByID(userID);
//    }

}
