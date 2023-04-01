package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
