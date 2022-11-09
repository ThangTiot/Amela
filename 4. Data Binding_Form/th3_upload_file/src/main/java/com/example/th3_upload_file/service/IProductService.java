package com.example.th3_upload_file.service;

import com.example.th3_upload_file.model.Product;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product) throws IOException;

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
