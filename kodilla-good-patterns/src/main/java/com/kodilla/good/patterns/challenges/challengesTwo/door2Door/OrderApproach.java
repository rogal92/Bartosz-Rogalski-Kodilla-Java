package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

public class OrderApproach {

    private List<Product> retriever;
    private LocalDateTime orderDate;
    private User user;
    private Product product;

    public OrderApproach(List<Product> retriever, LocalDateTime orderDate, User user, Product product) {
        this.retriever = retriever;
        this.orderDate = orderDate;
        this.user = user;
        this.product = product;
    }
    public OrderApproach() {
    }

    public List<Product> getRetriever() {
        return retriever;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}

