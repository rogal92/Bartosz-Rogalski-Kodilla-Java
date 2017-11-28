package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderService {

    public boolean rent(final User user, final LocalDateTime orderDate) {
        System.out.println("Ordering item for: " + user.getName() + user.getSurname()
                + "Order placed: " + orderDate.toString());
        return true;
    }
}
