package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();

    public Shape addFigure(Shape shape) {

        figures.add(shape);
        return shape;
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.remove(shape)) {
            result = true;
        }
        return result;
    }

    public Shape getFigure(int figureNumber) {
        Shape theFigure = null;
        if (figureNumber >= 0 && figureNumber < figures.size()) ;
        {
            theFigure = figures.get(figureNumber);
        }
        return theFigure;
    }

    public String showFigures() {

        StringBuilder sFigures = new StringBuilder().append("Circle ").append("Square ").append("Triangle");
        for (Shape shape: figures) {
            System.out.println(sFigures);
        }
        return sFigures.toString();
    }
}

