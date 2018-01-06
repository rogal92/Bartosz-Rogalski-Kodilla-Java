package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.util.List;

public class Product {
    private String productName;
    private int amount;
    private String id;

    public Product(String productName, int amount, String id) {
        this.productName = productName;
        this.amount = amount;
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    public String getId() {
        return id;
    }
}