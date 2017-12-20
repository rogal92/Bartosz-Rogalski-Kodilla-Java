package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

public class InformationServiceTwoImpl implements InformationServiceTwo {


    public InformationServiceTwoImpl() {
    }

    @Override
    public void inform(User user) {
        System.out.println("Your order is being prepared");
    }
}
