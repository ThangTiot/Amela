package com.example.bt2_dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping("/")
    public String init() {
        return "index";
    }
    @GetMapping("/dictionary")
    public ModelAndView convert(@RequestParam String value) {
        ModelAndView modelAndView = new ModelAndView("index");
        String result = "Khong tìm thấy trong từ điển!";
        String[] english = {"apple", "why", "what", "cat"};
        String[] vn = {"Táo", "Tại sao", "Cái gì", "Con mèo"};
        for (int i = 0; i < english.length; i++) {
            if (value.toLowerCase().equals(english[i])) {
                result = vn[i];
                break;
            }
        }
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
