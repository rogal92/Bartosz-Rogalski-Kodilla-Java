package com.kodilla.stream;

import com.kodilla.stream.beautifer.PoemBeautifier;
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
        poemBeautifier.beautify("Find first 3 letters sequence...", "Success", (a, b) -> "ABC"+a+"ABC" + b + "ABC");
        poemBeautifier.beautify("converted to uppercase ", "with lambda expression", (a, b) -> a.toUpperCase() + b.toUpperCase());
        poemBeautifier.beautify("NOW OTHERWISE, ", "ALSO WITH LAMBDA EXPRESSION", (a, b) -> a.toLowerCase()+ b.toLowerCase());
        poemBeautifier.beautify("Itself returned ", "with lambda expression", (a, b) -> a.toString()+b.toString());
        poemBeautifier.beautify("Word added is : ", "   Using intern method", (a, b) -> a.concat("Hello")+ b.intern());
    }
}
