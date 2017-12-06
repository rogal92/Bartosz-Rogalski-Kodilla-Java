package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.time.LocalDateTime;
import java.util.HashMap;

public class OrderApproach {

    private Supplier suplier;
    private HashMap<Supplier, Product> retriever;
    private LocalDateTime orderDate;

    public OrderApproach(Supplier suplier, Product product, HashMap<Supplier, Product> retriever, LocalDateTime orderDate) {
        this.suplier = suplier;
        this.retriever = retriever;
        this.orderDate = orderDate;
    }

    public Supplier getSuplier() {
        return suplier;
    }

    public HashMap<Supplier, Product> getRetriever() {
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

        if (!suplier.equals(that.suplier)) return false;
        if (!retriever.equals(that.retriever)) return false;
        return orderDate.equals(that.orderDate);
    }

    @Override
    public int hashCode() {
        int result = suplier.hashCode();
        result = 31 * result + retriever.hashCode();
        result = 31 * result + orderDate.hashCode();
        return result;
    }
}


