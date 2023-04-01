package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Reservation;
import com.example.service.ReservationService;

@RestController
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/reservations")
	public List<Reservation> findAll(){
		return (List<Reservation>) reservationService.findAll();
	}
}
