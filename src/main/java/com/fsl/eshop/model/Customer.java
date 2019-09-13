package com.fsl.eshop.model;

import lombok.Data;

@Data
public class Customer {
    private String id;
    private String name;
    private String phoneNumber;
    private String emailId;
    private Address deliveryAddress;
}
