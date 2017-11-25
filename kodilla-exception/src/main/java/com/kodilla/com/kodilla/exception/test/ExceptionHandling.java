package com.kodilla.com.kodilla.exception.test;

import java.io.File;

public class ExceptionHandling {

    public void readFile(){

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("SecondChallenge/probablyWillThrowException").getFile());

        System.out.println(file.getPath());
    }
}
