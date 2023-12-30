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
    public String registerUser(@ModelAttribute("user") User user) {
        if (userService.findByEmail(user.getEmail()).isPresent() || userService.findByUserName(user.getUserName()).isPresent()) {
            return "registerError";
        }
        // Checkpoint: add in separate error page
            userService.saveUser(user);
//        if (userService.findByEmail(model.getAttribute("email")).isPresent()) {
//            return new ResponseEntity<>("Email is already taken", HttpStatus.BAD_REQUEST);
//        }
//
//        userService.saveUser(user);
        return "index";
    }

    @PostMapping("/login")
    public String userLogin(@ModelAttribute("user") User user, Model model){
        if(userService.findByUserName(user.getUserName()).isPresent() && userService.findByPassword(user.getPassword()).isPresent()){
            return "index";
        }
        model.addAttribute("error", "User not found. Please check your credentials.");
        return "login";
    }

}
