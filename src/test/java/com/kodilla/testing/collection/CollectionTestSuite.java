package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

public class CollectionTestSuite {
    @Before
    private void before(){
        System.out.println("Test begin");
    }
    @After
    private void after(){
        System.out.println(Test end);
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
    public void testOddNumbersExterminatorEmptyList(){}
    public void testOddNumbersExterminatorNormalList(){}
}
