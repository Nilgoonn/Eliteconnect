package com.paisly.elite_connect.repository;

import com.paisly.elite_connect.model.SimCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimRepo extends JpaRepository<SimCard, Long> {
}
