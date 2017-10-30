package com.kodilla.testing.collection;

import java.util.*;
import java.util.ArrayList;


class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers)
    {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(int even : numbers)
        {
            if(even % 2 == 0)
            {
                evenNumbers.add(even);
            }
        }

        return evenNumbers;
    }

}

//    public ArrayList exterminate(ArrayList<Integer> numbers){
//        numbers.add(1);
//        numbers.add(32);
//        numbers.add(14);
//        numbers.add(12);
//        numbers.add(56);
//        numbers.add(68);
//        numbers.add(43);
//        numbers.add(89);
//        numbers.add(15);
//        numbers.add(66);
//        numbers.add(21);
//        numbers.add(12);
//        numbers.add(10);
//
//        ArrayList<Integer> even = new ArrayList<>();
//
//        for(Integer evenValue : numbers) {
//            if (evenValue % 2 == 0 ){
//                even.add();
//            }
//        }
//    }
//}

