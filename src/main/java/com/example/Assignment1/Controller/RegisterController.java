package com.example.Assignment1.Controller;

import com.example.Assignment1.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String showForm(Model model) {
        Model user = model.addAttribute("user", new User());
        return "register";
    }
    @PostMapping("/confirmation")
    public String submitForm(@ModelAttribute User user, Model model) {
         model.addAttribute("submittedUser", user);
         return "confirmation";
 }
}

