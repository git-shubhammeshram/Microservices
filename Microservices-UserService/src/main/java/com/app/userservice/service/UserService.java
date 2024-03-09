package com.app.userservice.service;

import java.util.List;

import com.app.userservice.entities.UserEntity;

public interface UserService {

	/*Here we are creating user operations*/
	
	/*Creating new user*/
	UserEntity saveUser(UserEntity user);
	
	/*Getting all the user*/
	List<UserEntity> getAllUser();
	
	/*Getting single user*/
	
	UserEntity getUser(String userId);
}
