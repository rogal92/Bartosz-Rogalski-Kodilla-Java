package com.kodilla.testing.shape;

public class ShapeCollector {

    public Integer addFigure(Shape shape){

        Circle circle = new Circle(2.0);
        figures.add(circle);

        Triangle triangle = new Triangle(5.0,6.0);
        figures.add(triangle);

        Square square = new Square(5.0);
        figures.add(square);
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
    }
    public Integer showFigures(Circle circle, Square square, Triangle triangle){
        return 100;
    }
}

