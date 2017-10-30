package com.kodilla.testing.shape;

public class Triangle implements Shape {


    Double triangleH;
    Double triangleS;

    public Triangle(Double triangleH, Double triangleS) {
        this.triangleH = triangleH;
        this.triangleS = triangleS;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public Double getField() {
            return (triangleH*triangleS)/2;
    }
    }
