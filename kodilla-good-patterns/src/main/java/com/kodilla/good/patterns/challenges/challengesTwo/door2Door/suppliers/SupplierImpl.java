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
        String id = orderApproach.getSupplierId();

        HashMap<String, Supplier> orderMap = new HashMap<>();

        orderMap.put(id,glutenFreeShopSupplier);
        orderMap.put(id,healthyShopSupplier);
        orderMap.put(id,extraFoodShopSupplier);

        if(orderMap.get(id).equals("Extra Food Shop")) {
            extraFoodShopSupplier.process(orderApproach);
        }
    }
}