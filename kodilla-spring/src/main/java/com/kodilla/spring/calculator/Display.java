package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public final class Display {


    public final void displayValue() {
        double val = 10.0;
        System.out.println(val);
    }
}
