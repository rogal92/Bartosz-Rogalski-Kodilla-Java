package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

public class OrderDtoTwo {
    public Suplier suplier;
    public boolean isOrdered;

    public OrderDtoTwo(Suplier suplier, boolean isOrdered) {
        this.suplier = suplier;
        this.isOrdered = isOrdered;
    }
    public Suplier getSuplier() {
        return suplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
