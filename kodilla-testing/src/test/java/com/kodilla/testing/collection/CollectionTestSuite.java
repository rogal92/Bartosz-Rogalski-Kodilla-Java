package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public void testEvenValuesSize(){
        OddNumbersExterminator oddNE = new OddNumbersExterminator();
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,33,44,123,45,42,33));

        //when
        ArrayList<Integer> even = (oddNE.exterminate(list));

        //then
        Assert.assertEquals(3, even.size());
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        OddNumbersExterminator oddNETwo = new OddNumbersExterminator();
//        Given
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList());

//        When
        ArrayList<Integer> empty = (oddNETwo.exterminate(list));
//        Then
        Assert.assertEquals(empty.isEmpty(), empty);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        OddNumbersExterminator oddNEThree = new OddNumbersExterminator();
//        Given
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,33,44,123,45,42,33));

//        When
        ArrayList<Integer> normal = (oddNEThree.exterminate(list));
//        Then
        Assert.assertEquals(normal.containsAll(list),list);
    }
}


