package com.example.th1_spring_aop.service;

import com.example.th1_spring_aop.model.Customer;
import com.example.th1_spring_aop.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        System.out.println("Method findAll() called");
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
}
