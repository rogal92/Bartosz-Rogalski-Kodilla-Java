//package com.kodilla.spring.calculator;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.test.context.junit4.SpringRunner;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class CalculatorTestSuite {
//
//    @Test
//    public void testCalculations(){
//        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Calculator calculator = context.getBean(Calculator.class);
//        //When
//        double add = calculator.add(5.0,5.0);
//        calculator.sub(5.0,5.0);
//        calculator.mul(5.0,5.0);
//        calculator.div(5.0,5.0);
//        //Then
//        Assert.assertEquals(10.0,);
//    }
//}
