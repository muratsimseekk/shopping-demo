package com.invio.shoppingdemo.dto;

import com.invio.shoppingdemo.entity.Product;

import java.util.List;

public record OrderResponse (Long order_id , List<OrderProductResponse> order_summary , Double total_price) {
}
