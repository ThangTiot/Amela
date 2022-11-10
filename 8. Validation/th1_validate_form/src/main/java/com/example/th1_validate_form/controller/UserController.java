package com.example.th1_validate_form.controller;

import com.example.th1_validate_form.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/user")
    public ModelAndView show() {
        return new ModelAndView("index", "user", new User());
    }

    @PostMapping("/validate")
    public ModelAndView checkValidate(@Validated User user, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("index");
        }
        return new ModelAndView("result");
    }
}
