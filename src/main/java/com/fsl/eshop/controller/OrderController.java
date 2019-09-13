package com.fsl.eshop.controller;

import com.fsl.eshop.model.Order;
import com.fsl.eshop.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController("/api/orders")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrderById(@PathVariable String id){
        return orderService.findByOrderId(id);
    }

    @PostMapping("/save")
    public Order save(@RequestBody Order order){
        return orderService.save(order);
    }

}
