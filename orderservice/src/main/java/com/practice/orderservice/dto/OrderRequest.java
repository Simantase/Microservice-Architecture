package com.practice.orderservice.dto;

import lombok.Data;

@Data
public class OrderRequest {
	private int userId;
	private int productId;

}
