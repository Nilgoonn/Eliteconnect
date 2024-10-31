
package com.paisly.elite_connect.service;

import com.paisly.elite_connect.model.Customer;
import com.paisly.elite_connect.repository.CustomerRepo;
import com.paisly.elite_connect.repository.SimRepo;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;


    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
        }

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

        public Optional<Customer> getCustomerById(Long id) {
            return customerRepo.findById(id);
        }

    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer updateCustomer(Long id, Customer customerDetails) {
        return customerRepo.findById(id).map(customer -> {
            customer.setName(customerDetails.getName());
            customer.setEmail(customerDetails.getEmail());
            customer.setPhoneNumber(customerDetails.getPhoneNumber());
            return customerRepo.save(customer);
        }).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public void updateCustomer(Customer customer) {
        customerRepo.updateCustomer(customer);
    }


    //    public Customer findById(Long customer_id){
//        return customerRepo.findById(customer_id).orElse(null);
//    }
}
