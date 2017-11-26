package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.StringJoiner;

public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();

    public Shape addFigure(Shape shape) {

        figures.add(shape);
        return shape;
    }

    public boolean removeFigure(Shape shape) {
        return figures.remove(shape);
    }

    public Shape getFigure(int figureNumber) {

        return figures.get(figureNumber);
    }

    public String showFigures() {

        StringJoiner sFigures = new StringJoiner(" ");
        for(Shape shape: figures) {
            System.out.println(sFigures.add(shape.getShapeName()));
        }
        return sFigures.toString();
    }
}

