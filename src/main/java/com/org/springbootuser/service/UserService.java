package com.org.springbootuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.springbootuser.dao.UserDao;
import com.org.springbootuser.dto.User;

@Service
public class UserService {
	@Autowired
	UserDao dao;
	
	public User saveUser(User user) {
		return dao.saveUser(user);
	}
	public List<User> findAllUsers(){
		return dao.findAllUsers();
	}
	public User findUserById(int id) {
		return dao.findUserById(id);
	}
	public String deleteUser(int id) {
		return dao.deleteUser(id);
	}
	public User updateUser(User user) {
		return dao.updateUser(user);
	}
	
	public List<User> findUserByName(String name){
		return dao.findUserByName(name);
	}
	public List<User> findUserByEmail(String email){
		return dao.findUserByEmail(email);
	}
	public List<User> validateUser(String email, String password){
		return dao.validateUser(email, password);
	}
}
