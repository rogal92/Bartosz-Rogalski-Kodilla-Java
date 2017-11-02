package com.kodilla.stream.beautifer;

public class PoemBeautifier {

    public void beautify(String a, String b, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(a,b);
        System.out.println("Beutify me -> "+ result);
    }
}
