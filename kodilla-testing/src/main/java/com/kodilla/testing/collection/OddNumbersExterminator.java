package com.kodilla.testing.collection;

import java.util.*;
import java.util.ArrayList;


class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers)
    {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(int number : numbers)
        {
            if(number % 2 == 0)
            {
                evenNumbers.add(number);
            }
        }

        return evenNumbers;
    }
}