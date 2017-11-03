package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();

    public Shape addFigure(Shape shape) {

        figures.add(shape);
        return null;
    }

    public boolean removeFigure(Shape shape) {
        return figures.remove(shape);
    }

    public Shape getFigure(int figureNumber) {

        return figures.get(figureNumber);
    }

    public String showFigures() {

        StringBuilder sFigures = new StringBuilder();
        for (Shape shape: figures) {
            System.out.println(sFigures.append(shape));
        }
        return sFigures.toString();
    }
}

