package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Square;
import org.junit.*;
import static org.junit.Assert.assertArrayEquals;

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

        Assert.assertEquals(new Double(40.0), circleField.getField());
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

        Assert.assertEquals(new Triangle(5.0, 6.0) , triangleField.getField());
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

        Assert.assertEquals(new Square(5.0), squareField.getField());
    }
    @Test
    public void testAddFigure(){
//        Given
        ShapeCollector shapeCollector = new ShapeCollector();
//        When
        shapeCollector.addFigure();
//        Then
        Assert.assertEquals(1, shapeCollector.getFigure(1));
    }
}