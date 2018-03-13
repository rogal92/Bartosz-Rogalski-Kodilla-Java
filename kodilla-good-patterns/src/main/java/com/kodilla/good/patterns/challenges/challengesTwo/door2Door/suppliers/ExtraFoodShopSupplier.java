package com.kodilla.good.patterns.challenges.challengesTwo.door2Door.suppliers;

import com.kodilla.good.patterns.challenges.challengesTwo.door2Door.OrderApproach;

public class ExtraFoodShopSupplier implements Supplier{
    @Override
    public void process(OrderApproach orderApproach) {
    }
    private String id;

    public ExtraFoodShopSupplier(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
