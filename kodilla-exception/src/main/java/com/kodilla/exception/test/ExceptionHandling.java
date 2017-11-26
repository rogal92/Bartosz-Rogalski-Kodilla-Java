package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String [] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyWillThrowException(1,1.5);
        } catch (Exception e) {
            System.out.println("Manual exception" + " " + e);
        }
        finally {
            System.out.println("This is going to be here always");
        }
    }
}
