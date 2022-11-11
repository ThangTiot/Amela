package com.example.th3_shopping_cart.service;

import com.example.th3_shopping_cart.model.Product;
import com.example.th3_shopping_cart.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService{

    @Autowired
    IProductRepository productRepository;
    @Override
    public Iterable<Product> findAll() {
        System.out.println(productRepository.findAll());
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
}
