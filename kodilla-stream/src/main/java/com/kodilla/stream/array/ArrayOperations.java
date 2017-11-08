package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public interface ArrayOperations {
    static void getAverage(int[] numbers){
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(4);
        numbersList.add(40);
        numbersList.add(43);
        numbersList.add(12);
        numbersList.add(35);
        numbersList.add(66);
        numbersList.add(76);
        numbersList.add(2);
        numbersList.add(34);
        numbersList.add(5);
        numbersList.add(8);
        numbersList.add(0);
        numbersList.add(41);
        numbersList.add(99);
        numbersList.add(13);
        numbersList.add(61);
        numbersList.add(55);
        numbersList.add(33);
        numbersList.add(77);
        numbersList.add(90);

        IntStream.range(0, numbersList.size());
        //tu powinna być jakaś komenda do wyświetlenia listy?

        //Random random = new Random();
        //random.ints().limit(20).forEach(System.out::println);

        // przeczytałem gdzieś że też można by było zrobić tak(bez dodawania liczb do listy tak jak w liniach 12-31?), efekt by był podobny?
        // wiem, że to nie zgodne z treścią zadania ale tak z ciekawości
        IntStream.range(0, numbersList.size())
        double a = numbersList.collect(Collectors.averagingDouble(n -> Double.parseDouble(n)));
        System.out.println(a);
    }
}