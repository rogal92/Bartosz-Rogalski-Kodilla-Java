package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.util.List;

public class Product {
    private String productName;
    private int amount;
    private SupplierImpl supplier;

    public Product(String productName, int amount, SupplierImpl supplier) {
        this.productName = productName;
        this.amount = amount;
        this.supplier = supplier;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    public SupplierImpl getSupplier() {
        return supplier;
    }
}