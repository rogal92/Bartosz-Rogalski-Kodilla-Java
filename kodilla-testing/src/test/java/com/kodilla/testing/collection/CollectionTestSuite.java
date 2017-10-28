package com.kodilla.testing.collection;

import org.junit.*;

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






    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        OddNumbersExterminator oddNETwo = new OddNumbersExterminator();



    }
}

