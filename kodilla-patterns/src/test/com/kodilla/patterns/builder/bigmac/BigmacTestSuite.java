package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Standard")
                .burgers(3)
                .sauce("Thousand Islands")
                .ingredient(Bigmac.Ingredients.CHILLI)
                .ingredient(Bigmac.Ingredients.BEKON)
                .ingredient(Bigmac.Ingredients.SER)
                .ingredient(Bigmac.Ingredients.SALATA)
                .build();
        System.out.println(bigmac);
        //When
        int ingredientsAmount = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, ingredientsAmount);
    }
}