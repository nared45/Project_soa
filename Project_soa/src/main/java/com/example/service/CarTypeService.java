package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Car_Type;
import com.example.repository.CarTypeRepository;

@Service
public class CarTypeService {
	@Autowired
	private CarTypeRepository carTypeRepository;
	
	public List<Car_Type> findAll() {
		return (List<Car_Type>) carTypeRepository.findAll();
	}
	
	public void delete(int id) {
		carTypeRepository.deleteById(id);
	}
}
