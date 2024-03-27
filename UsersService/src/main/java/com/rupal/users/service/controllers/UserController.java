package com.rupal.users.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rupal.users.service.entities.User;
import com.rupal.users.service.services.UserService;

@RestController
@RequestMapping("/Users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User userDto = userService.createUser(user);
		return ResponseEntity.status(HttpStatus.OK).body(userDto);
		
	}

	@GetMapping("/getUserById/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable String userId){
		User userDto = userService.getUserById(userId);
		return ResponseEntity.status(HttpStatus.OK).body(userDto);
		
	}
	
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> Users = userService.getAllUsers();
		return ResponseEntity.status(HttpStatus.OK).body(Users);
		
	}
	
}
