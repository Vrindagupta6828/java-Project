package com.vrinda.Food.App.controller;

import com.vrinda.Food.App.Entity.User;
import com.vrinda.Food.App.Respository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    final private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/index")
    public String createUser(Model model){
        User user=new User();
        model.addAttribute("Users", user);
        return "index";
    }

    @PostMapping("/index")
    public String saveUser(@ModelAttribute("Users") User user){
        userRepository.save(user);
        return "redirect:/home";
    }
}
