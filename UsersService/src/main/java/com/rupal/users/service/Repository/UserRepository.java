package com.rupal.users.service.Repository;


import com.rupal.users.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{

	
}
