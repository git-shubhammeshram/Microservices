package com.app.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.userservice.entities.UserEntity;
import com.app.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class User {

	@Autowired
	private UserService us;
	
	@PostMapping
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user){
		
		UserEntity save = us.saveUser(user);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(save);
	}
	
	
	@GetMapping()
	public ResponseEntity<List<UserEntity>> getAllUser(){
		
		List<UserEntity> allUser = us.getAllUser();
		return ResponseEntity.ok(allUser);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable String userId){
		
		UserEntity getSingleUser = us.getUser(userId);
		return ResponseEntity.ok(getSingleUser);
	}
}
