package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

public class OrderDtoTwo {

    public User user;
    public boolean isOrdered;

    public OrderDtoTwo(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }
    public User getUser() {
        return user;
    }
    public boolean isOrdered() {
        return isOrdered;
    }
}
