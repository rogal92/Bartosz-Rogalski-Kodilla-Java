package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import com.kodilla.good.patterns.challenges.challengesTwo.door2Door.suppliers.ExtraFoodShopSupplier;
import com.kodilla.good.patterns.challenges.challengesTwo.door2Door.suppliers.GlutenFreeShopSupplier;
import com.kodilla.good.patterns.challenges.challengesTwo.door2Door.suppliers.HealthyShopSupplier;
import com.kodilla.good.patterns.challenges.challengesTwo.door2Door.suppliers.Supplier;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Supplier> suppliers = new ArrayList<>();
        ExtraFoodShopSupplier extraFoodShopSupplier = new ExtraFoodShopSupplier("Extra Food");
        GlutenFreeShopSupplier glutenFreeShopSupplier = new GlutenFreeShopSupplier("Gluten Free Shop");
        HealthyShopSupplier healthyShopSupplier = new HealthyShopSupplier("Healthy Shop Supplier");

        OrderApproachRetriever orderApproachRetriever = new OrderApproachRetriever();
        OrderApproach orderApproach = orderApproachRetriever.retrieve();

        ProductOrderServiceTwo productOrderServiceTwo = new ProductOrderServiceTwo(new InformationServiceTwoImpl(),new OrderServiceTwoImpl(suppliers),new OrderRepositoryTwoImpl());
        productOrderServiceTwo.process(orderApproach);

        suppliers.add(extraFoodShopSupplier);
        suppliers.add(glutenFreeShopSupplier);
        suppliers.add(healthyShopSupplier);
    }
}
