package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    Circle circle = new Circle(2.0);
    Square square = new Square(5.0);
    Triangle triangle = new Triangle(5.0,6.0);

    List<Shape> figures = new ArrayList<>();

    public Shape addFigure(Shape shape){

        figures.add(shape);
        return shape;
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int figureNumber){
        Shape theFigure = null;
        if(figureNumber >= 0 && figureNumber < figures.size());{
            theFigure = figures.get(figureNumber);
        }
        return theFigure;
    }
    public List showFigures(List<Shape> allFigures){
        allFigures.add(circle);
        allFigures.add(square);
        allFigures.add(triangle);
        return allFigures;
    }
}

