package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

public class OrderApproach {

    private List<Product> retriever;
    private LocalDateTime orderDate;
    private User user;
    private String supplierId;

    public OrderApproach(List<Product> retriever, LocalDateTime orderDate, User user,String supplierId) {
        this.retriever = retriever;
        this.orderDate = orderDate;
        this.user = user;
        this.supplierId = supplierId;
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

    public String getSupplierId() {
        return supplierId;
    }
}

