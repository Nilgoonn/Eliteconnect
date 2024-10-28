package com.paisly.elite_connect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "simProvider")
@Data
@RequiredArgsConstructor
public class SimProvider {

    @Id
    private Long providerId;
    private String providerName;
}
