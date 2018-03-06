package com.kodilla.good.patterns.challenges.challengesTwo.door2Door.suppliers;

import com.kodilla.good.patterns.challenges.challengesTwo.door2Door.OrderApproach;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SupplierImpl implements Supplier {
    @Override
    public void process(OrderApproach orderApproach) {

        GlutenFreeShopSupplier glutenFreeShopSupplier = new GlutenFreeShopSupplier("Gluten Free Shop");
        HealthyShopSupplier healthyShopSupplier = new HealthyShopSupplier("Healthy Shop");
        ExtraFoodShopSupplier extraFoodShopSupplier = new ExtraFoodShopSupplier("Extra Food Shop");
        String id = orderApproach.getSupplierId();
        HashMap<String, Supplier> orderMap = new HashMap<>();

        orderMap.put(glutenFreeShopSupplier.getId(),glutenFreeShopSupplier);
        orderMap.put(healthyShopSupplier.getId(),healthyShopSupplier);
        orderMap.put(extraFoodShopSupplier.getId(),extraFoodShopSupplier);

        orderMap.get(id).process(orderApproach);
    }
}