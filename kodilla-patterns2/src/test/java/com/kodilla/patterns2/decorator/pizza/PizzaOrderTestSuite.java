package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.pizza.*;
import org.junit.Test;

import java.math.BigDecimal;
import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(15,calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        String description = theOrder.getDescritpion();

        //Then
        assertEquals("Basic with tomato sauce and cheese",description);
    }
    @Test
    public void testBasicWithSeafoodGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SeafoodIngredientDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(23,calculatedCost);
    }
    @Test
    public void testBasicWithSeafoodGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SeafoodIngredientDecorator(theOrder);

        //When
        String description = theOrder.getDescritpion();

        //Then
        assertEquals("Basic with tomato sauce and cheese + seafood",description);
    }
    @Test
    public void testBasicWithExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(17,calculatedCost);
    }
    @Test
    public void testBasicWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);

        //When
        String description = theOrder.getDescritpion();

        //Then
        assertEquals("Basic with tomato sauce and cheese + extra cheese",description);
    }
    @Test
    public void testBasicWithAngusMeatGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AngusMeatIngredientDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(23,calculatedCost);
    }
    @Test
    public void testBasicWithAngusMeatDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AngusMeatIngredientDecorator(theOrder);

        //When
        String description = theOrder.getDescritpion();

        //Then
        assertEquals("Basic with tomato sauce and cheese + angus meat",description);
    }
    @Test
    public void testBasicWithAngusMeatAndExtraCheesGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new AngusMeatIngredientDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(25,calculatedCost);
    }
    @Test
    public void testBasicWithAngusMeatAndCheeseDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new AngusMeatIngredientDecorator(theOrder);

        //When
        String description = theOrder.getDescritpion();

        //Then
        assertEquals("Basic with tomato sauce and cheese + extra cheese + angus meat",description);
    }
}
