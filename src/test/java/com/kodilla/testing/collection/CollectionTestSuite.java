package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

class CollectionTestSuite {
    @Before
    private void before(){
        System.out.println("Test begin");
    }
    @After
    private void after(){
        System.out.println("Test end");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Begin");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test end");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNE = new OddNumbersExterminator();

        boolean resultOne = oddNE(exterminate());


        Assert.assertEquals();

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        OddNumbersExterminator oddNETwo = new OddNumbersExterminator();

        Integer resultTwo = oddNETwo.();

        Assert.assertEquals();
    }
}
