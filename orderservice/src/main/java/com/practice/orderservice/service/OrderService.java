package com.practice.orderservice.service;

import com.practice.orderservice.dto.OrderRequest;
import com.practice.orderservice.dto.OrderResponse;

public interface OrderService {
	public OrderResponse createOrder(OrderRequest request);
}
