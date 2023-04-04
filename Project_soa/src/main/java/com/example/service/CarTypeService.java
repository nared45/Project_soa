package com.example.service;

import java.util.List;
import java.util.Optional;

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
	
	public Car_Type findById(int id) {
		return carTypeRepository.findById(id).get();
	}
	
	public void updateType(Car_Type carType) {
		carTypeRepository.save(carType);
	}
}
