package com.kodilla.testing.collection;

public class OddNumbersExterminator {

    Integer exterminate(ArrayList<Integer> numbers){

        Arraylist<Integer> even = new ArrayList<>();

        while (numbers.size() > 0) {
            Integer value = numbers.poll();
            if(value.length() % 2 == 0){
                even.add(value);
            } else {
                System.out.println("Something went wrong");
            }
        }
    }
}
