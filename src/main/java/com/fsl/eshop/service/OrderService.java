package com.fsl.eshop.service;

import com.fsl.eshop.model.Order;
import com.fsl.eshop.repository.OrderRepository;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Component
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public Optional<Order> findByOrderId(String orderId){
        return orderRepository.findById(orderId);
    }

    public Order save(Order order){
        return isNewOrder(order) ? newOrder(order) : orderRepository.save(order);
    }

    private Order newOrder(Order order) {
        return orderRepository.save(order.toBuilder().id(UUID.randomUUID().toString()).build());
    }

    private boolean isNewOrder(Order order) {
        return Objects.isNull(order.getId());
    }
}
