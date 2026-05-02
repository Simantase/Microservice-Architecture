package com.practice.orderservice.client;

import org.springframework.stereotype.Component;

import com.practice.orderservice.dto.ProductResponse;

@Component
public class ProductClientFallback implements ProductClient {

    @Override
    public ProductResponse getProductById(int productId) {
        return ProductResponse.builder()
                .productId(productId)
                .productName("FEIGN_FALLBACK")
                .productPrice(0)
                .build();
    }
}
