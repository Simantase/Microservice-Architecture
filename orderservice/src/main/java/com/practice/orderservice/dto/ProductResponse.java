package com.practice.orderservice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class ProductResponse {
	private int productId;
	private String productName;
	private int productPrice;
	
}
