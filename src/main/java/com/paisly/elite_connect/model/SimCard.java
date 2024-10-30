package com.paisly.elite_connect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "simCard")
@Data
@RequiredArgsConstructor
public class SimCard {

    @Id
    private Long simID;
    private String simNumber;
    private String isSold; //previous name : status

    @ManyToOne
    private SimType typeID;
//    @ManyToOne
//    private Simprovider providerID;
}
