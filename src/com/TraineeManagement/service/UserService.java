package com.TraineeManagement.service;

import com.TraineeManagement.dao.user.User;

public interface UserService {
	public void addUser(User user);
	public User getUser(String username, String password);
}
