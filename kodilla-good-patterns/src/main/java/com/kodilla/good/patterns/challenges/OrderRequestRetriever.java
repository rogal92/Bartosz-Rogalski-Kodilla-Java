package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Chris","Nowak",22,'M');

        LocalDateTime orderDate = LocalDateTime.of(2017,11,2,16,33);
        return new OrderRequest(user, orderDate);
    }
}
