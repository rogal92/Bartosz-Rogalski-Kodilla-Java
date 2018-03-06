package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.lang.reflect.Constructor;

public class Application {
    public static void main(String[] args) {

        OrderApproachRetriever orderApproachRetriever = new OrderApproachRetriever();
        OrderApproach orderApproach = orderApproachRetriever.retrieve();

        ProductOrderServiceTwo productOrderServiceTwo = new ProductOrderServiceTwo(new InformationServiceTwoImpl(),new OrderServiceTwoImpl(),new OrderRepositoryTwoImpl());
        productOrderServiceTwo.process(orderApproach);
    }
}
