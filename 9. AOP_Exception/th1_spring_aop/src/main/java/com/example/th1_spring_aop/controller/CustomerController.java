package com.example.th1_spring_aop.controller;

import com.example.th1_spring_aop.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView show() {
        return new ModelAndView("customer/index", "customerList", customerService.findAll());
    }

}
