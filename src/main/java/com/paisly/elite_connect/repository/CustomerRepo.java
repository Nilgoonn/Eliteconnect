package com.paisly.elite_connect.repository;

//import com.paisly.elite_connect.model.Customer;
import com.paisly.elite_connect.model.CustomerTest;
//import com.paisly.elite_connect.model.SimCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerTest, Integer>{
}

