package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public interface ArrayOperations {
    static void getAverage(int[] numbers){
        List<Integer> numbersList = new ArrayList<>();

        IntStream.range(0, numbersList.size());
        //tu powinna być jakaś komenda do wyświetlenia listy?

        //Random random = new Random();
        //random.ints().limit(20).forEach(System.out::println);

        // przeczytałem gdzieś że też można by było zrobić tak, efekt by był podobny?
        // wiem, że to nie zgodne z treścią zadania ale tak z ciekawości
        IntStream.range(0, numbersList.size())
        double a = numbersList.collect(Collectors.averagingDouble(n -> Double.parseDouble(n)));
        System.out.println(a);
    }
}