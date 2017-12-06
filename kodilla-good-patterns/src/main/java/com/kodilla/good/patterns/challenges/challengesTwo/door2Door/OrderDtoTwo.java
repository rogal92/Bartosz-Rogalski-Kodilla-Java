package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

public class OrderDtoTwo {
    public Supplier suplier;
    public boolean isOrdered;

    public OrderDtoTwo(Supplier suplier, boolean isOrdered) {
        this.suplier = suplier;
        this.isOrdered = isOrdered;
    }
    public Supplier getSuplier() {
        return suplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
