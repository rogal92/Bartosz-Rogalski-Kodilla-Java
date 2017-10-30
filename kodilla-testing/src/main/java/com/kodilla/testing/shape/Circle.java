package com.kodilla.testing.shape;

public class Circle implements Shape{



    Double circleField;

    public Circle(Double circleField) {
        this.circleField = circleField;
    }

    public String getShapeName(){
        return "Circle";
    }

    public Double getField(){

        return Math.PI*circleField*circleField;
    }
}







