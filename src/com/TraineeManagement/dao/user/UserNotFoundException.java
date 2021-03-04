package com.TraineeManagement.dao.user;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(String message) {
		super(message);
	}
}
