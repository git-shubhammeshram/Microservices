package com.app.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.userservice.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

}
