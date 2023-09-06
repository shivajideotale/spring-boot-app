package com.spring.boot.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.app.entity.User;
import com.spring.boot.app.services.UserRepository;

@RestController
@RequestMapping("api/")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/greetings")
	public String welcomeMessage(){
		
		return "Welcome To The REST API";
	}
	
	@GetMapping("/get-users")
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
		
	}
	
	@PostMapping("/add-users")
	public void addUser(@Validated @RequestBody User user){
		
		userRepository.save(user);
		
	}
	
	@GetMapping("/get-users/{id}")
	public Optional<User> getUserById(@PathVariable("id") long id){
		
		Optional<User> userData = userRepository.findById(id);
		return userData;
	}
	
	//	public Optional<User> updateUser(@PathVariable("id") long id){
	//		
	//		Optional<User> userData = userRepository.findById(id);
	//		
	//		if(userData.isPresent()) {
	//			
	//			System.out.println("User is already present" +userData);
	//		}
	//		else
	//		return userData;
}
