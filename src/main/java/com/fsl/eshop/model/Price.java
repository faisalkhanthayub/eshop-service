package com.fsl.eshop.model;

import lombok.Data;

import java.math.BigInteger;
import java.util.Currency;

@Data
public class Price {
    private BigInteger amount;
    private Currency currency;
}
