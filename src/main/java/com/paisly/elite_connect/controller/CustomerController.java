package com.paisly.elite_connect.controller;

import com.paisly.elite_connect.model.CustomerTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("customer")
    public String saveCustomer (@RequestBody CustomerTest customer) {
        customerService.saveCustomer(customer);
        return "customer saved";
    }

    @GetMapping("customer/{customerId}")
    public CustomerTest getCustomerById(@PathVariable int customerId) {
        customerService.getById(customerId);
    }










}
