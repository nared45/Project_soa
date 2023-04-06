package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.CarType;
import com.example.repository.CarTypeRepository;

@Service
public class CarTypeService {
	@Autowired
	private CarTypeRepository carTypeRepository;
	
	public List<CarType> findAll() {
		return (List<CarType>) carTypeRepository.findAll();
	}
	
	public CarType createType(CarType type) {
        return carTypeRepository.save(type);
    }
	
	public void delete(int id) {
		carTypeRepository.deleteById(id);
	}
	
	public CarType findById(int id) {
		return carTypeRepository.findById(id).get();
	}
	
	public void updateType(CarType carType) {
		carTypeRepository.save(carType);
	}
}
