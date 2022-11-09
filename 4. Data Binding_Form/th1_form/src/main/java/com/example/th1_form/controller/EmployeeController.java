package com.example.th1_form.controller;

import com.example.th1_form.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping
    public ModelAndView showForm(@ModelAttribute("employee") Employee employee) {
        return new ModelAndView("/create");
    }

    @PostMapping("/info")
    public ModelAndView info(@ModelAttribute("employee") Employee employee) {
        return new ModelAndView("/info");
    }
}
