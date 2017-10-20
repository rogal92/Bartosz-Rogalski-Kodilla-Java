package com.kodilla.testing.collection;

public class OddNumbersExterminator {

    ArrayList<Integer> even = new ArrayList<>();

   public void exterminate(ArrayList<Integer> numbers){

       while(numbers.size() > 0){
           Integer value = numbers.poll();
           if(value.length() % 2 == 0) {
               even.add(value);
           }else{
               System.out.println("Something went wrong ;/");

           }
       }
       System.out.println("This list shows only even numbers of the "numbers" list" + even);
   }
}

class Application {
    public static void main(String[] args){

        ArrayList<Integer>
    }
}