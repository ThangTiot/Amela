package com.example.th2_login.controller;

import com.example.th2_login.model.Login;
import com.example.th2_login.model.User;
import com.example.th2_login.model.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @GetMapping
    public String home(@ModelAttribute("login") Login login) {
        return "home";
    }

    @PostMapping("/login")
    public ModelAndView login(Login login) {
        UserDao userDao = new UserDao();
        User user = userDao.checkLogin(login);
        if (user != null) {
            return new ModelAndView("user", "user", user);
        } else {
            return new ModelAndView("error");
        }
    }
}
