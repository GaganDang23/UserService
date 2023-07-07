package com.webosmotic.service;

import java.util.List;

import com.webosmotic.entity.User;

public interface UserService {
	
	//create
	User createUser(User user);
	
	//get all user
	List<User> getAllUser();
	
	//get single user
	User getUser(String userId);
	
	

}
