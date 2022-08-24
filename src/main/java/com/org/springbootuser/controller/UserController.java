package com.org.springbootuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.springbootuser.dto.User;
import com.org.springbootuser.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@GetMapping("/users")
	public List<User> findAllUsers(){
		return service.findAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User findUserById(@PathVariable int id) {
		return service.findUserById(id);
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
	@GetMapping("/userbyname/{name}")
	public List<User> findUserByName(@PathVariable String name){
		return service.findUserByName(name);
	}
	
	@GetMapping("/userbyemail/{email}")
	public List<User> findUserByEmail(@PathVariable String email){
		return service.findUserByEmail(email);
	}
	
	@GetMapping("/validate/{email}/{password}")
	public List<User> validateUser(@PathVariable String email, @PathVariable String password){
		return service.validateUser(email, password);
	}
}
