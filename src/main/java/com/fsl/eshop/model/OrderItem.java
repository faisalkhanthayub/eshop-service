package com.fsl.eshop.model;

import lombok.Data;

@Data
public class OrderItem {
    private Product product;
    private Integer quantity;
}
