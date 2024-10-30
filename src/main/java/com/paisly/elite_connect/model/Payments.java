package com.paisly.elite_connect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "payments")
@Data
@RequiredArgsConstructor
public class Payments {

    @Id
    private Long paymentID;
    private float amount;
    private Date paymentDate;

}
