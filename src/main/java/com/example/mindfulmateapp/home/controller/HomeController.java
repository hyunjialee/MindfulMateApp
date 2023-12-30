package com.example.mindfulmateapp.home.controller;

import com.example.mindfulmateapp.user.model.User;
import com.example.mindfulmateapp.user.repository.UserRepository;
import com.example.mindfulmateapp.user.service.UserServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private UserServiceImplement userService;
    @GetMapping("/")
    public String home(Model model){
        User user = new User();
        model.addAttribute("user", user); // Assuming you have a User class with a 'username' field
        return "home";
    }

    @PostMapping("/")
    public String registerUser(@ModelAttribute("user") User user) {
        // Process the user object, e.g., save it to the database
        userService.saveUser(user);

        // Redirect to a success page or return a view
        return "redirect:/registration-success"; // Replace with the actual success page URL
    }


}
