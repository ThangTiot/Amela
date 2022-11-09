package com.example.bt1_product_manager.controller;

import com.example.bt1_product_manager.model.Product;
import com.example.bt1_product_manager.service.IProductService;
import com.example.bt1_product_manager.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
@EnableWebMvc
public class ProductController {
    private final IProductService productService = new ProductService();

    @GetMapping("")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/index");
        List<Product> products = productService.findAll();
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirectAttributes) {
        product.setId((int) (Math.random() * 10000));
        productService.save(product);
        redirectAttributes.addFlashAttribute("success", "Success!");
        return "redirect:/product";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/update");
        modelAndView.addObject(productService.findById(id));
        return modelAndView;
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirectAttributes) {
        productService.update(product.getId(), product);
        redirectAttributes.addFlashAttribute("success", "Update success!");
        return "redirect:/product";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/confirm");
        modelAndView.addObject("id", id);
        return modelAndView;
    }

    @GetMapping("/confirm/{id}")
    public String confirm(@PathVariable int id, RedirectAttributes redirectAttributes) {
        productService.remove(id);
        redirectAttributes.addFlashAttribute("success", "Delete success!");
        return "redirect:/product";
    }

    @GetMapping("/view/{id}")
    public ModelAndView view(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("product", productService.findById(id));
        return modelAndView;
    }

    @PostMapping("/search")
    public ModelAndView update(@RequestParam String search) {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("products", productService.findAllByName(search));
        modelAndView.addObject("search", search);
        return modelAndView;
    }
}
