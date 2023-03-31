package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Car;
import com.example.service.CarService;

@RestController
public class CarController {
	@Autowired
	private CarService carService;
	
	@GetMapping("/cars")
	public List<Car> findAll(){
		return (List<Car>) carService.findAll();
	}
}
