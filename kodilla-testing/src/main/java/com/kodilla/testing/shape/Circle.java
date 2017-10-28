package com.kodilla.testing.shape;

public class Circle implements Shape{


    String circleName;
    Integer circleField;

    public Circle(String shapeName, Integer field) {
        this.circleName = shapeName;
        this.circleField = field;
    }

//    public String getCircleName() {
//        return circleName;
//    }
//
//    public Integer getCircleField() {
//        return circleField;
//    }

        public void getShapeName(){
        System.out.println(circleName);
    }

    public void getField(){
        System.out.println(circleField);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (!circleName.equals(circle.circleName)) return false;
        return circleField.equals(circle.circleField);
    }

    @Override
    public int hashCode() {
        int result = circleName.hashCode();
        result = 31 * result + circleField.hashCode();
        return result;
    }
}
