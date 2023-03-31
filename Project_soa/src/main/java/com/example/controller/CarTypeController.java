package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CarTypeService;
import com.example.service.UserService;
import com.example.model.Car_Type;
import com.example.model.Users;


@RestController
public class CarTypeController {
	
	@Autowired
	private CarTypeService carTypeService;

	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	@GetMapping("/cartypes")
	public List<Car_Type> findAllCarType() {
		return (List<Car_Type>) carTypeService.findAll();
	}
	
}
