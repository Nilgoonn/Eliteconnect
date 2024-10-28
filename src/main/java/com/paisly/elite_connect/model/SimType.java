package com.paisly.elite_connect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "simType")
@Data
@RequiredArgsConstructor
public class SimType {

    @Id
    private Long typeID;
    private String typeName;
    private float typePrice;
}
