package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest implements OrderService {

    public OrderRequest() {}

    @Override
    public boolean order(User user, LocalDateTime orderDate) {
        return false;
    }

    private User user;
    private LocalDateTime date;

    public OrderRequest(User user, LocalDateTime date) {
        this.user = user;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
