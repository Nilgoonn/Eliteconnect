package com.paisly.elite_connect.model;

import jakarta.persistence.*;

@Entity
@Table(name = "simOrder")
public class SimOrder {

    @Id
    private Long simOrderId;
    private Date simOrderDate;

    @ManyToOne
    private int customerId;

    @OneToMany
    private int simId;
    @OneToOne
    private int paymentId;

}
