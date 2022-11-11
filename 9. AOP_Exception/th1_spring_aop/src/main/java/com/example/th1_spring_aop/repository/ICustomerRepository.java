package com.example.th1_spring_aop.repository;

import com.example.th1_spring_aop.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    void save(Customer customer);
}
