package com.example.th1_counter_view.controller;

import com.example.th1_counter_view.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(value = "counter")
public class CounterController {
    @ModelAttribute("counter")
    public Counter get() {
        return new Counter();
    }

    @GetMapping("/")
    public ModelAndView get(Counter counter) {
        counter.increment();
        return new ModelAndView("index");
    }
}
