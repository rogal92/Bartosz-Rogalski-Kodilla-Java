package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

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
        double a = Arrays.stream(number).collect(Collectors.averagingDouble(n -> Double.parseDouble(n)));
        System.out.println(a);
    }
}