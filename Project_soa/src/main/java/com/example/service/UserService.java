package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Car;
import com.example.model.Users;
import com.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<Users> findAll(){
		return (List<Users>) userRepository.findAll();
	}
	
	public Users createUser(Users user) {
        return userRepository.save(user);
    }
}
