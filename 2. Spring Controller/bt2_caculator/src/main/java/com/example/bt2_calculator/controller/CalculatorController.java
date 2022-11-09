package com.example.bt2_calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping("/default")
    String getIndex() {
        return "calculator";
    }
    @GetMapping("/add")
    public ModelAndView calculator(@RequestParam int num1, int num2) {
        ModelAndView modelAndView = new ModelAndView("calculator");
        int result = num1 + num2;
        modelAndView.addObject("calculation", "+");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
