package com.example.th2_custom_validate.controller;

import com.example.th2_custom_validate.model.PhoneNumber;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class PhoneController {
    @GetMapping
    public ModelAndView show() {
        return new ModelAndView("index", "phoneNumber", new PhoneNumber());
    }

    @PostMapping("/validate")
    public ModelAndView checkValidate(@Valid PhoneNumber phoneNumber, BindingResult bindingResult) {
        new PhoneNumber().validate(phoneNumber, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("index");
        }
        return new ModelAndView("result", "phoneNumber", phoneNumber);
    }
}
