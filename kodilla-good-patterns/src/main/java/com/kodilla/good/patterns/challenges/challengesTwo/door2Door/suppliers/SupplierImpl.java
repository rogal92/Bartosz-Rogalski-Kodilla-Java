package com.kodilla.good.patterns.challenges.challengesTwo.door2Door.suppliers;

import com.kodilla.good.patterns.challenges.challengesTwo.door2Door.OrderApproach;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SupplierImpl implements Supplier {
    @Override
    public void process(OrderApproach orderApproach) {

        GlutenFreeShopSupplier glutenFreeShopSupplier = new GlutenFreeShopSupplier();
        HealthyShopSupplier healthyShopSupplier = new HealthyShopSupplier();
        ExtraFoodShopSupplier extraFoodShopSupplier = new ExtraFoodShopSupplier();

        String productName = orderApproach.getProduct().getProductName();

        switch (productName) {
            case "Extra Food Product":
                extraFoodShopSupplier.process();
                break;
            case "Healthy Food Product":
                healthyShopSupplier.process();
                break;
            case "Gluten Free Product":
                glutenFreeShopSupplier.process();
                break;
        }
    }
}