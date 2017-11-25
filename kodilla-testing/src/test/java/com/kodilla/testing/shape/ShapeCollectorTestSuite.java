package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test number" + testCounter);
    }

    @Test
    public void testCircleName() {
        //Given
        Circle circleName = new Circle( new Double(2.0));
//When
        String name = circleName.getShapeName();
//Then
        Assert.assertEquals("Circle", name);
    }
    @Test
    public void testCircleField() {
        //Given
        Circle circleField = new Circle( new Double(2.0));
//When
        Double field = circleField.getField();
//Then
        Assert.assertEquals(new Double(12.566370614359172), field);
    }
    @Test
    public void testTriangleName() {
        //Given
        Triangle triangleName = new Triangle(5.0,6.0);
//When
        triangleName.getShapeName();
//Then
        Assert.assertEquals("Triangle", triangleName.getShapeName());
    }
    @Test
    public void testTriangleField() {
        //Given
        Triangle triangleField = new Triangle(5.0,6.0);
//When
        Double field = triangleField.getField();
//Then
        Assert.assertEquals(new Double(15) , field);
    }
    @Test
    public void testSquareName() {
        //Given
        Square squareName = new Square(5.0);
//When
        String name = squareName.getShapeName();
//Then
        Assert.assertEquals("Square", name);
    }
    @Test
    public void testSquareField() {
        //Given
        Square squareField = new Square(5.0);
//When
        Double field = squareField.getField();
//Then
        Assert.assertEquals(new Double(25), field);
    }
    @Test
    public void testAddFigure(){
        Circle circle = new Circle(2.0);
//        Given
        ShapeCollector shapeCollector = new ShapeCollector();
//        When
        Shape addCircle = shapeCollector.addFigure(circle);
//        Then
        Assert.assertEquals(circle, addCircle);
    }
    @Test
    public void testRemoveFigure(){
//        Given
        Circle circle = new Circle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
//        When
        boolean deleted = shapeCollector.removeFigure(circle);
//        Then
        Assert.assertTrue(deleted);
    }
    @Test
    public void testGetFigure(){
//        Given
        Circle circle = new Circle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
//        When
        Shape figure = shapeCollector.getFigure(0);
//        Then
        Assert.assertEquals(circle, figure);
    }
    @Test
    public void testShowFigure(){

//        Given
        Circle circle = new Circle(2.0);
        Triangle triangle = new Triangle(5.0,6.0);
        Circle circle1 = new Circle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(triangle);
//        When
        String show = shapeCollector.showFigures();
//        Then
        Assert.assertEquals("Circle Circle Triangle", shapeCollector.showFigures());
    }
}