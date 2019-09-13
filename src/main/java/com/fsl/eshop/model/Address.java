package com.fsl.eshop.model;

import lombok.Data;

@Data
public class Address {
    private String street;
    private String houseNumber;
    private String city;
    private String zipCode;
}
