package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.time.LocalDateTime;

public interface OrderRepositoryTwo {
    boolean generateOrder(User user, LocalDateTime orderDate);
}
