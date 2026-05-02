package com.practice.orderservice.controller;

import com.practice.orderservice.dto.OrderRequest;
import com.practice.orderservice.dto.OrderResponse;
import com.practice.orderservice.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public OrderResponse createOrder(@RequestBody OrderRequest request) {
        return orderService.createOrder(request);
    }
}