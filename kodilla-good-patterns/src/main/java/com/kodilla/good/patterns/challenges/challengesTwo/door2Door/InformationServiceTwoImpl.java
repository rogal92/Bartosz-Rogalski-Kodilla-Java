package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

public class InformationServiceTwoImpl implements InformationServiceTwo {

    @Override
    public void inform(User user) {
        System.out.println("Your order is being prepared");
    }
    public InformationServiceTwoImpl() {}
}
