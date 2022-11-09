package com.example.th3_upload_file.controller;

import com.example.th3_upload_file.model.Product;
import com.example.th3_upload_file.service.IProductService;
import com.example.th3_upload_file.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
public class ProductController {

    private final IProductService productService = new ProductService();

    @ModelAttribute("products")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("home");
    }

    @GetMapping("/create")
    public ModelAndView create(@ModelAttribute("product") Product product) {
        return new ModelAndView("create");
    }

    @PostMapping("/save")
    public String save(Product product) throws IOException {
        productService.save(product);
        return "redirect:/";
    }
}
