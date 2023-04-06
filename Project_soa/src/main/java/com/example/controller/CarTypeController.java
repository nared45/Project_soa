package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CarTypeService;
import com.example.service.UserService;
import com.example.model.Car;
import com.example.model.CarType;
import com.example.model.Users;


@RestController
@RequestMapping("/cartypes")
public class CarTypeController {
	
	@Autowired
	private CarTypeService carTypeService;

	@GetMapping
	public List<CarType> findAllCarType() {
		return (List<CarType>) carTypeService.findAll();
	}
	@GetMapping("/{id}")
	public CarType findById(@PathVariable("id") int id) {
		return carTypeService.findById(id);
	}
	
	@PostMapping
    public ResponseEntity<CarType> create(@RequestBody CarType type) {
    	CarType newType = carTypeService.createType(type);
        return new ResponseEntity<CarType>(newType, HttpStatus.CREATED);
    }
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		carTypeService.delete(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateType(@RequestBody CarType carType,@PathVariable("id") int id){
		//Car carDB = new Car();
		carType.setTypeId(id);
		carTypeService.updateType(carType);
		String successMessage = "update car type Successfully.";
		ResponseEntity<String> response = new ResponseEntity<String>(successMessage, HttpStatus.OK);
		return response;
	}
}
