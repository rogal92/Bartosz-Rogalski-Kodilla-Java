package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.time.LocalDateTime;

public class OrderRepositoryTwoImpl implements OrderRepositoryTwo{
    @Override
    public boolean generateOrder(User user, LocalDateTime orderDate) {
        System.out.println("Order in repository");
        return true;
    }
}
