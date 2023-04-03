package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Reservation;
import com.example.repository.ReservationRepository;

@Service
public class ReservationService {
	@Autowired
	private ReservationRepository reservationRepository;
	
	public List<Reservation> findAll(){
		return (List<Reservation>) reservationRepository.findAll();
	}
	
	public void delete(int id) {
		reservationRepository.deleteById(id);
	}
}
