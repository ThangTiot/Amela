package com.example.bt1_product_manager.service;

import com.example.bt1_product_manager.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    List<Product> findAllByName(String name);

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
