package com.example.bt1_product_manager.service;

import com.example.bt1_product_manager.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {

    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Hoa Qua", 20.5, "ngon"));
        products.put(2, new Product(2, "Banh keo", 500, "re"));
        products.put(3, new Product(3, "O to", 1000, "dat"));
        products.put(4, new Product(4, "Xe dap", 200, "cu"));
        products.put(5, new Product(5, "Xe may", 300, "tot"));
        products.put(6, new Product(6, "Nuoc hoa", 400, "thom"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public List<Product> findAllByName(String name) {
        List<Product> listProductByName = new ArrayList<>();
        for (Product p : findAll()) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                listProductByName.add(p);
            }
        }
        return listProductByName;
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
