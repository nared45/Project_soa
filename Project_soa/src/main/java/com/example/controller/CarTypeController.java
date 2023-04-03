package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CarTypeService;
import com.example.service.UserService;
import com.example.model.Car_Type;
import com.example.model.Users;


@RestController
@RequestMapping("/cartypes")
public class CarTypeController {
	
	@Autowired
	private CarTypeService carTypeService;

	
	
	@GetMapping
	public List<Car_Type> findAllCarType() {
		return (List<Car_Type>) carTypeService.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		carTypeService.delete(id);
	}
}
