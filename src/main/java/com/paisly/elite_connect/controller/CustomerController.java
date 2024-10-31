package com.paisly.elite_connect.controller;

import com.paisly.elite_connect.model.Customer;
import com.paisly.elite_connect.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping({"/", "home"})
    public String home() {return "home";}

    @GetMapping("allcustomers")
    @ResponseBody
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomers();
}

    @GetMapping("/{customer_id}")
        public ResponseEntity<Customer> getCustomerById(@PathVariable Long customer_id){
        Optional<Customer> customer = customerService.getCustomerById(customer_id);
        return customer.map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @PutMapping("/{customer_id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long customer_id, @RequestBody Customer customer){
        Optional<Customer> updatedCustomer = customerService.updateCustomer(Long id);
        return updatedCustomer.map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{customer_id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long customer_id) {
        if (customerService.deleteCustomer(customer_id)){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}


