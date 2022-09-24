package com.sevitha.learn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sevitha.learn.model.User;

@Service
public class UserService {

	List<User> list=new ArrayList<>();

	public UserService() {
		list.add(new User("Sevitha", "sev123", "sev@gmail.com"));
		list.add(new User("Jyothish", "jyo123", "jyo@gmail.com"));
		
	}
	
	//get all users
	public List<User> getAllUsers()
	{
		return this.list;
		
	}
	
	//get single user
	public User getSingleUser(String userName)
	{
		return this.list.stream().filter((user)->user.getUsername().equals(userName)).findAny().orElse(null);
		
	}
	
	//Add new user
	public User addUser(User user)
	{
		this.list.add(user);
		return user;
	}
	
}
