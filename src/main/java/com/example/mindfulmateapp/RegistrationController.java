package com.example.mindfulmateapp;

import com.example.mindfulmateapp.user.model.User;
import com.example.mindfulmateapp.user.service.UserServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @Autowired
    private UserServiceImplement userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }
//
//    @PostMapping("/api/users/register")
//    public String registerUser(@ModelAttribute("user") User user) {
//        userService.saveUser(user);
//        return "redirect:/login";
//    }
}

