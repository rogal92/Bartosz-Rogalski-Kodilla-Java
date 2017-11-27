package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static Double getAverage(final int[] numbers){

        IntStream.range(0, numbers.length).forEach(v -> System.out.println(numbers[v]) );
        IntStream.range(0, numbers.length).map(v -> numbers[v]).average();
        double a = Arrays.stream(numbers).boxed().collect(Collectors.averagingDouble(n -> n.doubleValue()));
        System.out.println(a);
        return a;
    }
}