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
                .build();
        System.out.println(bigmac);
        //When
        int ingredientsAmount = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, ingredientsAmount);
    }
}