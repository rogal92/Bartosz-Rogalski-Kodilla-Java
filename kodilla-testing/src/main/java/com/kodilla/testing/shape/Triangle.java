package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private Double triangleH;
    private Double triangleS;

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

    @Override
    public String toString() {
        return getShapeName();
    }
}
