
package com.paisly.elite_connect.service;

//import com.paisly.elite_connect.model.Customer;
import com.paisly.elite_connect.model.CustomerTest;
import com.paisly.elite_connect.repository.CustomerRepo;
//import com.paisly.elite_connect.repository.SimRepo;
//import lombok.Builder;
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

    public List<CustomerTest> getAllCustomers() {
        return customerRepo.findAll();
    }

        public Optional<CustomerTest> getCustomerById(Integer customerTestId) {
            return customerRepo.findById(customerTestId);
        }

    public void saveCustomer(CustomerTest customer) {
        customerRepo.save(customer);
        if (customer.getPhone().length() > 10)
            System.out.println("invalid phone");
    }

    public CustomerTest updateCustomer(Integer id, CustomerTest customerDetails) {
        return customerRepo.findById(id).map(customer -> {
            customer.setName(customerDetails.getName());
            customer.setEmail(customerDetails.getEmail());
            customer.setPhone(customerDetails.getPhone());
            return customerRepo.save(customer);
        }).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

//    public void updateCustomer(CustomerTest customer) {
//        customerRepo.updateCustomer(customer);
//    }


}
