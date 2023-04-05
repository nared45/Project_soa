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

import com.example.model.Car;
import com.example.model.Car_Type;
import com.example.service.CarService;
import com.example.service.CarTypeService;

@RestController
@RequestMapping("/cars")
public class CarController {
	@Autowired
	private CarService carService;
	@Autowired
	private CarTypeService carTypeService;
	
	@GetMapping
	public List<Car> findAll(){
		return (List<Car>) carService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		carService.delete(id);
	}
	
	@PostMapping("/{carType_id}")
	public ResponseEntity<String> createUser(@RequestBody Car car,@PathVariable("carType_id") int id) {
		car.setCar_type(carTypeService.findById(id));
		carService.createCar(car);
		String successMessage = "Create cars Successfully.";
		ResponseEntity<String> response = new ResponseEntity<String>(successMessage, HttpStatus.OK);
		return response;
	}
	@PutMapping("/{id}/type/{carType_id}")
	public ResponseEntity<String> updateCar(@RequestBody Car car,@PathVariable("id") int id,
			@PathVariable("carType_id") int carType_id){
		//Car carDB = new Car();
		car.setCar_id(id);
		car.setCar_type(carTypeService.findById(carType_id));
		
//		carDB.setCar_id(id);
//		carDB.setCar_name(car.getCar_name());
//		carDB.setColor(car.getColor());
//		carDB.setDescription(car.getDescription());
//		carDB.setPlat_number(car.getPlat_number());
//		carDB.setPrice_per_day(car.getPrice_per_day());
//		carDB.setCar_type(carTypeService.findById(carType_id));
		carService.updateCar(car);
		String successMessage = "update cars Successfully.";
		ResponseEntity<String> response = new ResponseEntity<String>(successMessage, HttpStatus.OK);
		return response;
	}
	
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
