package com.app.userservice.Implement;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.userservice.entities.UserEntity;
import com.app.userservice.exception.ResourceNotFoundException;
import com.app.userservice.repository.UserRepository;
import com.app.userservice.service.UserService;

@Service
public class UserImplement implements UserService {
	
	@Autowired
	private UserRepository ur;
	

	@Override
	public UserEntity saveUser(UserEntity user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return ur.save(user);
	}

	@Override
	public List<UserEntity> getAllUser() {
		
		return ur.findAll();
	}

	@Override
	public UserEntity getUser(String userId) {
		
		return ur.findById(userId).orElseThrow(()-> new ResourceNotFoundException("UserService Not Found"+userId));
	}

}
