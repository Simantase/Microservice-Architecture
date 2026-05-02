package com.practice.userservice.service;

import org.springframework.stereotype.Service;

import com.practice.userservice.entity.User;

@Service
public interface UserService {

	public User saveUser(User user);

	public User getUserById(int userId);

}
