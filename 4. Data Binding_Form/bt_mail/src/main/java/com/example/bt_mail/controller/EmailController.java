package com.example.bt_mail.controller;

import com.example.bt_mail.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {
    @GetMapping("/home")
    public ModelAndView home(@ModelAttribute("email") Email email) {
        return new ModelAndView("home");
    }
}
