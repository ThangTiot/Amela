package com.example.bt1_sandwich;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class SandwichController {
    @GetMapping("/save")
    public ModelAndView save(@RequestParam(required = false) String[] condiments) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("condiments", condiments);
        return modelAndView;
    }
}
