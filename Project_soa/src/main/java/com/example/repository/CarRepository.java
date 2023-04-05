package com.example.repository;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    @Query("SELECT c FROM Car c WHERE c.car_id NOT IN " +
            "(SELECT r.car.car_id FROM Reservation r WHERE " +
            "(:startDate BETWEEN r.start_date AND r.end_date) OR " +
            "(:endDate BETWEEN r.start_date AND r.end_date))")
    List<Car> findAvailableCars(@Param("startDate") Date startDateAsDate, @Param("endDate") Date endDateAsDate);
}