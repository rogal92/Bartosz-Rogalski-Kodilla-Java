package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.time.LocalDateTime;
import java.util.HashMap;

public class OrderApproach {

    private HashMap<User, Product> retriever;
    private LocalDateTime orderDate;

    public OrderApproach(HashMap<User, Product> retriever, LocalDateTime orderDate) {
        this.retriever = retriever;
        this.orderDate = orderDate;
    }

    public HashMap<User, Product> getRetriever() {
        return retriever;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderApproach that = (OrderApproach) o;

        if (!retriever.equals(that.retriever)) return false;
        return orderDate.equals(that.orderDate);
    }

    @Override
    public int hashCode() {
        int result = retriever.hashCode();
        result = 31 * result + orderDate.hashCode();
        return result;
    }
}

