package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Car_Type;

@Repository
public interface CarTypeRepository extends JpaRepository<Car_Type, Integer> {

}
