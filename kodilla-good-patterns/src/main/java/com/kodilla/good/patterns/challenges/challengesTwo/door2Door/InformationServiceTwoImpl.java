package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

public class InformationServiceTwoImpl implements InformationServiceTwo {

    @Override
    public void inform(OrderApproach orderApproach) {
        System.out.println("Your order is in process" + orderApproach);
    }
}
