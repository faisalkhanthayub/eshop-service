package com.fsl.eshop.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class Order {
    private String id;
    private List<OrderItem> orderItems;
    private String description;
    private Address deliveryAddress;
    private Customer customer;
    private Status status;
    private Store store;
}
