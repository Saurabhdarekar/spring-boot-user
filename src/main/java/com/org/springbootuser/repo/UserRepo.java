package com.org.springbootuser.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.org.springbootuser.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	List<User> getByName(String name);
	List<User> getByEmail(String email);
	
	@Query("SELECT u FROM User u WHERE u.email = ?1 and u.password = ?2")
	List<User> validateUser(String email, String password);
}
