package com.example.th3_shopping_cart.controller;

import com.example.th3_shopping_cart.model.Cart;
import com.example.th3_shopping_cart.model.Product;
import com.example.th3_shopping_cart.service.IProductService;
import com.example.th3_shopping_cart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {

    @Autowired
    IProductService productService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        return new ModelAndView("shop","products", productService.findAll());
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }
    @GetMapping("/shopping-cart")
    public ModelAndView showCart (@ModelAttribute("cart") Cart cart){
        return new ModelAndView("/cart");
    }
}
