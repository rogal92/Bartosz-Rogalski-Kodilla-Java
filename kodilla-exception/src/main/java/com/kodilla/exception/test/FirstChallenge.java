package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            firstChallenge.divide(3, 0);

        } catch (ArithmeticException e) {
            System.out.println("We don't divide by 0! " + e);
        } finally {
            System.out.println("End of the program");
        }
    }
}