package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String triangleName;
    Integer triangleField;

    public Triangle(String triangleName, Integer triangleField) {
        this.triangleName = triangleName;
        this.triangleField = triangleField;
    }

//    public String getTriangleName() {
//        return triangleName;
//    }
//
//    public Integer getTriangleField() {
//        return triangleField;
//    }

        public void getShapeName() {
        System.out.println(triangleName);
    }

    public void getField() {
        System.out.println(triangleField);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (!triangleName.equals(triangle.triangleName)) return false;
        return triangleField.equals(triangle.triangleField);
    }

    @Override
    public int hashCode() {
        int result = triangleName.hashCode();
        result = 31 * result + triangleField.hashCode();
        return result;
    }
}
