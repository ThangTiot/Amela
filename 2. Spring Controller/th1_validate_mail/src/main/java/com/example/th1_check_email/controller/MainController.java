package com.example.th1_check_email.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/validate")
public class MainController {

    private final String EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    @GetMapping("/default")
    String getIndex() {
        return "default";
    }
    @PostMapping("/validate")
    public ModelAndView validateEmail(@RequestParam String email) {
        if (checkValidate(email)) {
            ModelAndView modelAndView = new ModelAndView("success");
            modelAndView.addObject("email", email);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("default");
            modelAndView.addObject("message", "Email is invalid");
            return modelAndView;
        }
    }

    public boolean checkValidate(String email) {
        return email.matches(EMAIL);
    }
}
