package com.Sky_Watch_App.SkyWatch.controllers;
import org.springframework.ui.Model;
import com.Sky_Watch_App.SkyWatch.entities.User;
import com.Sky_Watch_App.SkyWatch.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AppController {
    @Autowired
    private UserRepository userRepository;

    AppController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "signup_form";
    }
}
