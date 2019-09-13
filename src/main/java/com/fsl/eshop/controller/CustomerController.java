package com.fsl.eshop.controller;

import com.fsl.eshop.model.Customer;
import com.fsl.eshop.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController("/api/customers")
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @GetMapping("/")
    public Optional<Customer> getCustomerById(@PathVariable String id){
        return customerRepository.findById(id);
    }

    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
