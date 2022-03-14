package com.playground.charge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playground.charge.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	  List<User> findByActive(boolean active);
	  
	  List<User> findByName(String Name);

}
