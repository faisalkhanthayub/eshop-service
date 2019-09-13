package com.fsl.eshop.model;

import lombok.Builder;
import lombok.Data;

import java.util.Currency;

@Data
@Builder
public class Store {
    private String id;
    private String name;
    private byte[] image;
    private String phoneNumber;
    private String emailId;
    private Address address;
    private Currency currency;
}
