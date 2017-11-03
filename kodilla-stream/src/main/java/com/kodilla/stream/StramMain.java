package com.kodilla.stream;

import com.kodilla.stream.beautifer.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StramMain {
    public static void main(String [] args){
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Beutifier");
        poemBeautifier.beautify("Find first 3 letters sequence...",(a) -> "ABC"+a+"ABC");
        poemBeautifier.beautify("converted to uppercase ",  (a) -> a.toUpperCase());
        poemBeautifier.beautify("NOW OTHERWISE, ", (a) -> a.toLowerCase());
        poemBeautifier.beautify("Itself returned ", (a) -> a.toString());
        poemBeautifier.beautify("Word added is : ", (a) -> a.concat("Hello"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
