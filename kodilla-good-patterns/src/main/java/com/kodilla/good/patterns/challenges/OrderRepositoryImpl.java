package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRepositoryImpl implements OrderRepository{
    @Override
    public boolean createOrder(User user, LocalDateTime orderDate) {
        System.out.println("User user, LocalDateTime orderDate - in repository");
        return true;
    }

}
