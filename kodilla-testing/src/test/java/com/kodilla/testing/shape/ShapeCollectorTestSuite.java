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
        circleName.getShapeName();
//Then
        Assert.assertEquals("Circle", circleName.getShapeName());
    }
    @Test
    public void testCircleField() {
        //Given
        Circle circleField = new Circle( new Double(2.0));
//When
        circleField.getField();
//Then
        Assert.assertEquals(new Double(12.566370614359172), circleField.getField());
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
        triangleField.getField();
//Then
        Assert.assertEquals(new Double(15) , triangleField.getField());
    }
    @Test
    public void testSquareName() {
        //Given
        Square squareName = new Square(5.0);
//When
        squareName.getShapeName();
//Then
        Assert.assertEquals("Square", squareName.getShapeName());
    }
    @Test
    public void testSquareField() {
        //Given
        Square squareField = new Square(5.0);
//When
        squareField.getField();
//Then
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
        shapeCollector.addFigure(circle);
//        When
        shapeCollector.getFigure(0);
//        Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
    }
    @Test
    public void testShowFigure(){

//        Given
        Circle circle = new Circle(2.0);
        Circle circle1 = new Circle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(circle1);
//        When
        shapeCollector.showFigures();
//        Then
        Assert.assertEquals( "Circle","Circle", shapeCollector.showFigures());
    }
}