package com.example.controller;

import java.util.List;
import java.util.TimeZone;

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

import com.example.model.Car_Type;
import com.example.model.Reservation;
import com.example.service.CarService;
import com.example.service.ReservationService;
import com.example.service.UserService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	@Autowired
	private CarService carService;
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<Reservation> findAll(){
		return (List<Reservation>) reservationService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		reservationService.delete(id);
	}
	
	@PutMapping("/{id}/user/{userId}/car/{carId}")
	public ResponseEntity<String> updateReservation(@RequestBody Reservation reserve,@PathVariable("id") int id,
			@PathVariable("userId") int userId,@PathVariable("carId") int carId){
		//Car carDB = new Car();
		reserve.setReservation_id(id);
		reserve.setCar(carService.findById(carId));
		reserve.setUser(userService.findById(userId));
		reservationService.updateReservation(reserve);
		String successMessage = "update reservation Successfully.";
		ResponseEntity<String> response = new ResponseEntity<String>(successMessage, HttpStatus.OK);
		return response;
	}
}
