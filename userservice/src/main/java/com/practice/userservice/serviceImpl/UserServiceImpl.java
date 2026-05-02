package com.practice.userservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.userservice.entity.User;
import com.practice.userservice.repository.UserRepository;
import com.practice.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserById(int userId) {
		return userRepository.findById(userId)
				.orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
	}

}
