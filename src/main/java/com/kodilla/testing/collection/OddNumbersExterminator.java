package com.kodilla.testing.collection;

import java.util.*;

 class OddNumbersExterminator {

     ArrayList<ArrayList<Integer>> exterminate(ArrayList<Integer> numbers) {

         numbers.add(1);
         numbers.add(14);
         numbers.add(17);
         numbers.add(12);
         numbers.add(11);
         numbers.add(26);
         numbers.add(29);
         numbers.add(13);
         numbers.add(45);
         numbers.add(56);
         numbers.add(34);
         numbers.add(78);
         numbers.add(98);
         numbers.add(65);

         ArrayList<ArrayList<Integer>> even = new ArrayList<>();

         for (Integer evenValue : numbers) {
             if (evenValue % 2 == 0) {
                 even.add(numbers);
             }
         }
         return even;
     }
 }