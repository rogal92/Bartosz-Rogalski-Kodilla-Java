package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

public class OrderServiceTwoImpl implements OrderServiceTwo{
    @Override
    public boolean order(OrderApproach orderApproach) {
        System.out.println("Thank you for using our services! We have received your order approach!");
        return true;
    }
}