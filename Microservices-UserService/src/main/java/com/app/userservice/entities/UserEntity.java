package com.app.userservice.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="micro_user")
public class UserEntity {

	@Id
	@Column
	private String userId;
	@Column
	private String userName;
	@Column
	private String userEmail;
	@Column
	private String userAbout;
	
	@Transient
	private List<RatingEntity> ratings = new ArrayList<>();
	
	public UserEntity() {
		
	}

	public UserEntity(String userId, String userName, String userEmail, String userAbout) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userAbout = userAbout;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAbout() {
		return userAbout;
	}

	public void setUserAbout(String userAbout) {
		this.userAbout = userAbout;
	}
	
	
}
