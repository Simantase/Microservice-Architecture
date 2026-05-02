package com.practice.orderservice.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OrderResponse {
	private int userId;
	private String userName;
	private int productId;
	private String productName;
	private int productPrice;
	private String status;

}
