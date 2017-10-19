package com.kodilla.testing.calculator;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b){
        return a+b;
    }
    public int substract(int a, int b){
        return a-b;
    }
}
