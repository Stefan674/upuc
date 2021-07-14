package com.example.upravljanjeucenicima.repository;

import com.example.upravljanjeucenicima.model.Ucenik;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Skladiste extends JpaRepository<Ucenik, Long> {

}
