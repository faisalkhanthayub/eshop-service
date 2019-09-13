package com.fsl.eshop.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigInteger;

@Data
@Builder(toBuilder = true)
public class Product {
    private String id;
    private String name;
    private byte[] image;
    private Price price;
    private BigInteger stockQuantity;
    private String description;
    private Store store;
}
