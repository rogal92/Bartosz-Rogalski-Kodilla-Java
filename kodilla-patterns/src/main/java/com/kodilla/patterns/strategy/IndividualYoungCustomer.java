package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;

public class IndividualYoungCostumer extends Customer{
    public IndividualYoungCostumer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
