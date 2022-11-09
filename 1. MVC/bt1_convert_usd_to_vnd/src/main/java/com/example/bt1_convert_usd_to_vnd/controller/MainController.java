package com.example.bt1_convert_usd_to_vnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping("/convert")
    public ModelAndView convert(@RequestParam int usd) {
        ModelAndView modelAndView = new ModelAndView("index");
        int rate = 23000;
        int vnd = usd * rate;
        modelAndView.addObject("result", vnd);
        return modelAndView;
    }
}
