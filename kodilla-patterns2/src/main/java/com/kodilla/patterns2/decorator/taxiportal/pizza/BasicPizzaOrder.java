package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Basic with tomato sauce and cheese";
    }
}
