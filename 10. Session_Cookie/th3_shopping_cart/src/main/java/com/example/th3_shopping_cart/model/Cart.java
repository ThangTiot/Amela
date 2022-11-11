package com.example.th3_shopping_cart.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> products = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Product, Integer> products) {
        this.products = products;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public boolean checkItemInCart(Product product) {
        for (Product p : products.keySet()) {
            if (p.getId().equals(product.getId())) {
                return true;
            }
        }
        return false;
    }

    public Map.Entry<Product, Integer> selectItemInCart(Product product) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if (entry.getKey().getId().equals(product.getId())) {
                return entry;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (!checkItemInCart(product)) {
            products.put(product, 1);
        } else {
            Map.Entry<Product, Integer> item = selectItemInCart(product);
            products.replace(item.getKey(), item.getValue() + 1);
        }
    }
    public double countTotalPayment(){
        double payment = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            payment += entry.getKey().getPrice() * entry.getValue();
        }
        return payment;
    }
}
