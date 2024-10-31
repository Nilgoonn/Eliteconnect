package com.paisly.elite_connect.controller;

import com.paisly.elite_connect.model.CustomerTest;
import com.paisly.elite_connect.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("customer")
    public String saveCustomer (@RequestBody CustomerTest customer) {
        customerService.saveCustomer(customer);
        return "customer saved";
    }

//
//    @GetMapping("/{id}")
//    public ResponseEntity<CustomerTest> getCustomerById(@PathVariable Integer customerTestId) {
//        Optional<CustomerTest> customer = customerService.getCustomerById(customerTestId);
//
//        return customer.map(ResponseEntity::ok)
//                .orElseGet(() -> ResponseEntity.notFound().build());
    @GetMapping("customer/{customerTestId}")
    public CustomerTest getCustomerById(@PathVariable Integer customerTestId) {
        Optional<CustomerTest> customerTest = customerService.getCustomerById(customerTestId);
        return customerTest.orElse(new CustomerTest());

    }










}
