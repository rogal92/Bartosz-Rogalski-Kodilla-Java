package com.kodilla.com.kodilla.exception.main;

import com.kodilla.com.kodilla.exception.io.FileReader;
import com.kodilla.com.kodilla.exception.io.FileReaderException;

public class ExceptionModuleRunner {
    public static void main(String args[]){

        FileReader fileReader = new FileReader();

        try{
            fileReader.readFile();
        } catch (FileReaderException e){
            System.out.println("Problem while reading a file!");
        }
    }
}
