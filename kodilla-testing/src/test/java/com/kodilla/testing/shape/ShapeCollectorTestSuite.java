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
        Circle circleName = new Circle( new Double(2.0));

        circleName.getShapeName();

        Assert.assertEquals("Circle", circleName.getShapeName());
    }
    @Test
    public void testCircleField() {
        Circle circleField = new Circle( new Double(2.0));

        circleField.getField();

        Assert.assertEquals(new Double(12.566370614359172), circleField.getField());
    }
    @Test
    public void testTriangleName() {
        Triangle triangleName = new Triangle(5.0,6.0);

        triangleName.getShapeName();

        Assert.assertEquals("Triangle", triangleName.getShapeName());
    }
    @Test
    public void testTriangleField() {
        Triangle triangleField = new Triangle(5.0,6.0);

        triangleField.getField();

        Assert.assertEquals(new Double(15) , triangleField.getField());
    }
    @Test
    public void testSquareName() {
        Square squareName = new Square(5.0);

        squareName.getShapeName();

        Assert.assertEquals("Square", squareName.getShapeName());
    }
    @Test
    public void testSquareField() {
        Square squareField = new Square(5.0);

        squareField.getField();

        Assert.assertEquals(new Double(25), squareField.getField());
    }
    @Test
    public void testAddFigure(){
        Circle circle = new Circle(2.0);
//        Given
        ShapeCollector shapeCollector = new ShapeCollector();
//        When
        shapeCollector.addFigure(circle);
//        Then
        Assert.assertEquals(circle, shapeCollector.addFigure(circle));
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
        shapeCollector.getFigure(0);
//        When
        shapeCollector.getFigure(0);
//        Then
        Assert.assertEquals(0, shapeCollector.getFigure(0));
    }
    @Test
    public void testShowFigure(){

//        Given
        ShapeCollector shapeCollector = new ShapeCollector();
//        When
        shapeCollector.showFigures();
//        Then
        Assert.assertEquals( " ", shapeCollector.showFigures());
    }
}