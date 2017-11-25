package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static void getAverage(int[] number){

        number = new int[20];
        Random randomNumber = new Random();
        for (int i = 0; i <= 20 ; i++) {
            number[i] = randomNumber.nextInt();

                    IntStream.range(0, number.length);
            System.out.println(number[i]);
        }
        IntStream.range(0, number.length);
        double a = Arrays.stream(number).boxed().collect(Collectors.averagingDouble(n -> n.doubleValue()));
        System.out.println(a);
    }
}