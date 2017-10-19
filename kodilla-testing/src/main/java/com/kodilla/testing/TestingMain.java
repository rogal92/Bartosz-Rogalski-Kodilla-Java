package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator addTest = new Calculator(4, 3,0,0);

        int result = addTest.add(4, 3);

        if (result == (4 + 3)) {
            System.out.println("Test Ok!");
        } else {
            System.out.println("Error!");
        }

        Calculator substractTest = new Calculator(4, 3,0,0);

        int substractResult = substractTest.substract(4, 3);

        if (substractResult == (4 - 3)) {
            System.out.println("Test Ok!");
        } else {
            System.out.println("Error!");
        }
    }
}

