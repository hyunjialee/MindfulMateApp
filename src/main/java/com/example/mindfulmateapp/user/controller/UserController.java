package com.example.mindfulmateapp.user.controller;

import com.example.mindfulmateapp.user.model.User;
import com.example.mindfulmateapp.user.service.UserServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserServiceImplement userService;

    @Autowired
    public UserController(UserServiceImplement userService){
        this.userService = userService;
    }

    @GetMapping("/greet")
    public String welcomeUser(){
        return "Hi user";
    }

//    @GetMapping("/login")
//    public String loginUser(){
//        return "index";
//    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, Model model) {
        if (userService.findByEmail(user.getEmail()).isPresent() || userService.findByUserName(user.getUserName()).isPresent()) {
            model.addAttribute("errorMessage", "User with this email or username already exists.");
            return "registerError";
        }
        userService.saveUser(user);
        return "index";
    }

    @PostMapping("/login")
    public String userLogin(@ModelAttribute("user") User user, Model model){
        if(userService.findByUserName(user.getUserName()).isPresent() && userService.findByPassword(user.getPassword()).isPresent()){
            return "index";
        }
        model.addAttribute("error", "User not found. Please check your credentials.");
        return "loginError";
    }

}
