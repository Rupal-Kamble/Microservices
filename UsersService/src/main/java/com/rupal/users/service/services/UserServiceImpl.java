package com.rupal.users.service.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rupal.users.service.Exceptions.ResourceNotFoundException;
import com.rupal.users.service.Repository.UserRepository;
import com.rupal.users.service.entities.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User createUser(User user) {
		String userid = UUID.randomUUID().toString();
		user.setUserId(userid);
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(String userId) {
		User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server !! : " + userId));
		return user;
	}

	@Override
	public User updateUser(User user) {
		
		Optional<User> userDto = userRepository.findById(user.getUserId());
		userDto.get();
	
		return null;
	}

}
