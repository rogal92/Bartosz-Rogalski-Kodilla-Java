package com.kodilla.stream.beautifer;

public class PoemBeautifier {

    public void beautify(String a, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(a);
        System.out.println("Beutify me -> "+ result);
    }
}
