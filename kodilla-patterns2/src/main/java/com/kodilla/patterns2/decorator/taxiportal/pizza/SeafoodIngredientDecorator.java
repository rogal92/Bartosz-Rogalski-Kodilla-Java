package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;

public class SeafoodIngredientDecorator extends AbstractPizzaOrderDecorator {
    public SeafoodIngredientDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(8));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + seafood";
    }
}
