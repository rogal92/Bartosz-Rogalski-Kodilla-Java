package com.kodilla.testing.shape;

public class Square implements Shape {


    Double squareSide;

    public Square(Double squareSide) {
        this.squareSide = squareSide;
    }

    public String getShapeName() {
        return "Square";
    }

    public Double getField() {

        return squareSide*squareSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return squareSide.equals(square.squareSide);
    }

    @Override
    public int hashCode() {
        return squareSide.hashCode();
    }

    @Override
    public String toString() {
        return getShapeName();
    }
}

