package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.example.model.Reservation;
import com.example.model.Users;
import com.example.service.ReservationService;
import com.example.service.UserService;

import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:8082/")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private ReservationService reservationService;

	@GetMapping
	public List<Users> findAll() {
		return (List<Users>) userService.findAll();
	}

	@GetMapping("/{id}")
	public Users getUserByID(@PathVariable("id") int id) {
		return userService.findById(id);
	}

	@GetMapping("/{id}/reservations")
	public List<Reservation> getUserReservations(@PathVariable("id") int id){
		Users user = userService.findById(id);
		List<Reservation> res = reservationService.findByUser(user);
		return res;
	}

	@PostMapping
	public ResponseEntity<Users> createUser(@RequestBody Users user) {
		Users createdUser = userService.createUser(user);
		return new ResponseEntity<Users>(createdUser, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		userService.delete(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateUser(@RequestBody Users user, @PathVariable("id") int id) {
		user.setUser_id(id);
		userService.updateUser(user);
		String successMessage = "update user Successfully.";
		ResponseEntity<String> response = new ResponseEntity<String>(successMessage, HttpStatus.OK);
		return response;
	}

	@GetMapping("/login")
	public ResponseEntity<Users> getUserByUserAndPass(@Parameter(name="username")String username, @Parameter(name="password")String password) {
		Users user = userService.getByUserAndPass(username, password);
		if(user == null) {
			return new ResponseEntity<Users>(user, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Users>(user, HttpStatus.OK);
	}

}
