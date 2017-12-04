package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.time.LocalDateTime;
import java.util.HashMap;

public class OrderApproach {

    private Suplier suplier;
    private Product product;
    private HashMap<Suplier, Product> retriever;
    private LocalDateTime orderDate;

    public OrderApproach(Suplier suplier, Product product, HashMap<Suplier, Product> retriever, LocalDateTime orderDate) {
        this.suplier = suplier;
        this.product = product;
        this.retriever = retriever;
        this.orderDate = orderDate;
    }

    public Suplier getSuplier() {
        return suplier;
    }

    public Product getProduct() {
        return product;
    }

    public HashMap<Suplier, Product> getRetriever() {
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
        if (!product.equals(that.product)) return false;
        if (!retriever.equals(that.retriever)) return false;
        return orderDate.equals(that.orderDate);
    }

    @Override
    public int hashCode() {
        int result = suplier.hashCode();
        result = 31 * result + product.hashCode();
        result = 31 * result + retriever.hashCode();
        result = 31 * result + orderDate.hashCode();
        return result;
    }
}


