package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.CarType;

@Repository
public interface CarTypeRepository extends JpaRepository<CarType, Integer> {

}
