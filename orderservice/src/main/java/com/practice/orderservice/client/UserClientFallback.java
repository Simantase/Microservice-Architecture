package com.practice.orderservice.client;

import org.springframework.stereotype.Component;

import com.practice.orderservice.dto.UserResponse;

@Component
public class UserClientFallback implements UserClient{

	@Override
	public UserResponse getUserById(int userId) {
		return UserResponse.builder()
				.userId(userId)
				.userName("FEIGN_FALLBACK")
				.userEmail("Not availble")
				.build();
	}

}
