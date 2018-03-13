package com.kodilla.good.patterns.challenges.challengesTwo.door2Door.suppliers;

import com.kodilla.good.patterns.challenges.challengesTwo.door2Door.OrderApproach;

public interface Supplier {
    void process(OrderApproach orderApproach);
    String getId();
}
