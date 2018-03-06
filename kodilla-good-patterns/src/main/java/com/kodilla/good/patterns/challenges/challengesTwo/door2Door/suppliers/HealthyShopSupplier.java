package com.kodilla.good.patterns.challenges.challengesTwo.door2Door.suppliers;

import com.kodilla.good.patterns.challenges.challengesTwo.door2Door.OrderApproach;

public class HealthyShopSupplier implements Supplier {
    @Override
    public void process(OrderApproach orderApproach) {
    }
    private String id;

    public HealthyShopSupplier(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
