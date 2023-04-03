package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Car;
import com.example.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
	@Autowired
	private CarService carService;
	
	@GetMapping
	public List<Car> findAll(){
		return (List<Car>) carService.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		carService.delete(id);
	}
	
//	@PostMapping("/cars")
//	public ResponseEntity<String> createUser(@RequestBody Car car) {
//		carService.createCar(car);
//		String successMessage = "Create cars Successfully.";
//		ResponseEntity<String> response = new ResponseEntity<String>(successMessage, HttpStatus.OK);
//		return response;
//	}
	
//	@PostMapping("")
//	public ResponseEntity<String> createMenu(@RequestBody JsonNode body) {
//		Menu menu = new Menu();
//		MenuType menuType = menuTypeService.getMenuTypeByID(body.get("menuType").asInt());
//		menu.setMenuName(body.get("menuName").asText());
//		menu.setMenuDescription(body.get("menuDescription").asText());
//		menu.setMenuType(menuType);
//		menu.setMenuInCourses(null);
//		Menu check = menuService.getMenuByName(menu.getMenuName());
//		if(check == null) {
//			menuService.createOrUpdateMenu(menu);
//			String successMessage = "Create Menu Successfully.";
//			ResponseEntity<String> response = new ResponseEntity<String>(successMessage, HttpStatus.OK);
//			return response;
//		}
//		String successMessage = "Duplicate Menu Name.";
//		ResponseEntity<String> response = new ResponseEntity<String>(successMessage, HttpStatus.NOT_FOUND);
//		return response;
//	}
}
