package com.kodilla.testing.shape;

public class Square implements Shape {

    String squareName;
    Integer squareField;

    public Square(String squareName, Integer squareField) {
        this.squareName = squareName;
        this.squareField = squareField;
    }

//    public String getSquareName() {
//        return squareName;
//    }
//
//    public Integer getSquareField() {
//        return squareField;
//    }

        public void getShapeName() {
        System.out.println(squareName);
    }

    public void getField() {
        System.out.println(squareField);
    }

}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (!squareName.equals(square.squareName)) return false;
        return squareField.equals(square.squareField);
    }

    @Override
    public int hashCode() {
        int result = squareName.hashCode();
        result = 31 * result + squareField.hashCode();
        return result;
    }
}
