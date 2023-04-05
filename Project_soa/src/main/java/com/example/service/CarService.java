package com.example.service;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Car;
import com.example.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	public List<Car> findAll(){
		return (List<Car>) carRepository.findAll();
	}
	public List<Car> findAvailableCars(java.util.Date startDateAsDate, java.util.Date endDateAsDate) {
        return carRepository.findAvailableCars(startDateAsDate, endDateAsDate);
    }
	public void createCar(Car c){
		 carRepository.save(c);
	}
	public void updateCar(Car c){
		 carRepository.save(c);
	}
	
	public void delete(int id) {
		carRepository.deleteById(id);
	}
	public Car findById(int id) {
		return carRepository.findById(id).get();
	}

}
