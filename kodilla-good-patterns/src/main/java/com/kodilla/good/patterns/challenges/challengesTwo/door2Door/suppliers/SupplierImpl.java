package com.kodilla.good.patterns.challenges.challengesTwo.door2Door.suppliers;

import com.kodilla.good.patterns.challenges.challengesTwo.door2Door.OrderApproach;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SupplierImpl implements Supplier {

    private HashMap<String, Supplier> orderMap = new HashMap<>();
    private OrderApproach orderApproach = new OrderApproach();
    private String id = orderApproach.getSupplierId();
    private HealthyShopSupplier healthyShopSupplier;
    private ExtraFoodShopSupplier extraFoodShopSupplier;
    private GlutenFreeShopSupplier glutenFreeShopSupplier;

    public SupplierImpl(HashMap<String, Supplier> orderMap, String id, HealthyShopSupplier healthyShopSupplier,
                        ExtraFoodShopSupplier extraFoodShopSupplier, GlutenFreeShopSupplier glutenFreeShopSupplier) {
        this.orderMap = orderMap;
        this.id = id;
        this.healthyShopSupplier = healthyShopSupplier;
        this.extraFoodShopSupplier = extraFoodShopSupplier;
        this.glutenFreeShopSupplier = glutenFreeShopSupplier;

        orderMap.put(glutenFreeShopSupplier.getId(), glutenFreeShopSupplier);
        orderMap.put(healthyShopSupplier.getId(),healthyShopSupplier);
        orderMap.put(extraFoodShopSupplier.getId(),extraFoodShopSupplier);
    }

    @Override
    public void process(OrderApproach orderApproach) {
        orderMap.get(id).process(orderApproach);
   }
}