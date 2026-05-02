package com.practice.orderservice.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResponse {
	private int userId;
	private String userName;
	private String userEmail;
	
}
