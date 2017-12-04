package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

public class Product {
   private String productName;
   private int amount;

    public Product(String productName, int amount) {
        this.productName = productName;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }
}
