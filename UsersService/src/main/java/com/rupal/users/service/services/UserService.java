package com.rupal.users.service.services;

import java.util.List;
import java.util.Optional;

import com.rupal.users.service.entities.User;

public interface UserService {
	
	User createUser(User user);
	
	List<User> getAllUsers();
	
	User getUserById(String userId);
	
	User updateUser(User user);

}
