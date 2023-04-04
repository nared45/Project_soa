package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CarTypeService;
import com.example.service.UserService;
import com.example.model.Car;
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
	@GetMapping("/{id}")
	public Car_Type findById(@PathVariable("id") int id) {
		return carTypeService.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		carTypeService.delete(id);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateType(@RequestBody Car_Type carType,@PathVariable("id") int id){
		//Car carDB = new Car();
		carType.setType_id(id);
		carTypeService.updateType(carType);
		String successMessage = "update car type Successfully.";
		ResponseEntity<String> response = new ResponseEntity<String>(successMessage, HttpStatus.OK);
		return response;
	}
}
