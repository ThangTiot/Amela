package com.example.th1_spring_aop.service;

import com.example.th1_spring_aop.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);
}
