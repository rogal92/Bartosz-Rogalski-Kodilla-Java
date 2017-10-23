package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(10, 15);

        if (resultAdd == 10 + 15) {
            System.out.println("Test OK!");
        } else {
            System.out.println("Error!");
        }

        int resultSubstract = calculator.substract(10, 15);

        if (resultSubstract == 10 + 14) {
            System.out.println("Test Ok!");
        } else {
            System.out.println("Error!");
        }
    }
}