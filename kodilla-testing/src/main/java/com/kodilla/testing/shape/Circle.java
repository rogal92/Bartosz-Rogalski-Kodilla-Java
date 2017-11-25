package com.kodilla.testing.shape;

public class Circle implements Shape{
    private Double circleField;

    public Circle(Double circleRadius) {
        this.circleField = circleRadius;
    }

    public String getShapeName(){
        return "Circle";
    }

    public Double getField(){

        return Math.PI*circleField*circleField;
    }
    @Override
    public String toString() {
        return getShapeName()+ " ";
    }
}







