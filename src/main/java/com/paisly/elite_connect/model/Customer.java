package com.paisly.elite_connect.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Entity
@Table(name="Customer")
@Data
@RequiredArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customer_id;
    private String name;
    private String email;
    private String phone;
}
