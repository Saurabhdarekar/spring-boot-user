package com.org.springbootuser.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.springbootuser.dto.User;
import com.org.springbootuser.repo.UserRepo;

@Repository
public class UserDao {
	@Autowired
	UserRepo repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public List<User> findAllUsers(){
		return repo.findAll();
	}
	
	public User findUserById(int id) {
		Optional<User> user = repo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		else {
			return null;
		}
	}
	
	public String deleteUser(int id) {
		User user = findUserById(id);
		if(user != null) {
			repo.delete(user);
			return "usr del";
		}
		else {
			return "no user with specified id";
		}
	}
	
	public User updateUser(User user) {
		return repo.save(user);
	}
	
	public List<User> findUserByName(String name){
		return repo.getByName(name);
	}
	public List<User> findUserByEmail(String email){
		return repo.getByEmail(email);
	}
	public List<User> validateUser(String email, String password){
		return repo.validateUser(email, password);
	}
}
