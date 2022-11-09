package com.example.th1_customer_manager.service;

import com.example.th1_customer_manager.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService{

    private static final Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Thang", "t@gmai.com", "HN"));
        customers.put(2, new Customer(2, "Thu", "a@gmai.com", "HCM"));
        customers.put(3, new Customer(3, "Hue", "h@gmai.com", "HP"));
        customers.put(4, new Customer(4, "Diem", "d@gmai.com", "DL"));
        customers.put(5, new Customer(5, "Duyen", "d2@gmai.com", "CM"));
        customers.put(6, new Customer(6, "Cong", "c@gmai.com", "CT"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
