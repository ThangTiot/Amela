package com.example.th1_customer_manager.controller;

import com.example.th1_customer_manager.model.Customer;
import com.example.th1_customer_manager.service.CustomerService;
import com.example.th1_customer_manager.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
@EnableWebMvc
public class CustomerController {
    private final ICustomerService customerService = new CustomerService();

    @GetMapping("")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/index");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(Customer customer, RedirectAttributes redirectAttributes) {
        customer.setId((int) (Math.random() * 10000));
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success", "Success!");
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/update");
        modelAndView.addObject(customerService.findById(id));
        return modelAndView;
    }

    @PostMapping("/update")
    public String update(Customer customer, RedirectAttributes redirectAttributes) {
        customerService.update(customer.getId(),customer);
        redirectAttributes.addFlashAttribute("success", "Update success!");
        return "redirect:/customer";
    }
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/confirm");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
    @GetMapping("/confirm/{id}")
    public String confirm(@PathVariable int id, RedirectAttributes redirectAttributes) {
        customerService.remove(id);
        redirectAttributes.addFlashAttribute("success", "Delete success!");
        return "redirect:/customer";
    }
    @GetMapping("/view/{id}")
    public ModelAndView view(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("customer",customerService.findById(id));
        return modelAndView;
    }
}
