package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.util.HashMap;

public class OrderApproachRetriever {

    public OrderApproach orderApproach()

    {

        Suplier suplierOne = new Suplier("ExtraFoodShop", "Ząb", 1323423421);
        Suplier suplierTwo = new Suplier("HealthyShop", "Kościelisko", 1323678421);
        Suplier suplierThree = new Suplier("GlutenFreeShop", "Czerwienne", 1329883421);

        Product suplierOneProduct = new Product("Extra Food Product", 500);
        Product suplierTwoProduct = new Product("Healthy Shop Product", 600);
        Product suplierThreeProduct = new Product("Gluten Free Product", 400);

        HashMap<Suplier,Product> Orderretriever = new HashMap<>();
        Orderretriever.put(suplierOne, suplierOneProduct);
        Orderretriever.put(suplierTwo, suplierTwoProduct);
        Orderretriever.put(suplierThree, suplierThreeProduct);

        return orderApproach();
    }
}

