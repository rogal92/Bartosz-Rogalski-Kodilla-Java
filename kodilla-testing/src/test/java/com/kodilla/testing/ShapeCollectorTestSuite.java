package com.kodilla.testing;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Square;
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
        Circle circleName = new Circle("Circle", 40);

        circleName.getShapeName();

        Assert.assertEquals("Circle", circleName.getShapeName());
    }
    @Test
    public void testCircleField() {
        Circle circleField = new Circle("Circle", 40);

        circleField.getField();

        Assert.assertEquals(40, circleField.getField());
    }
    @Test
    public void testTriangleName() {
        Triangle triangleName = new Triangle("Triangle", 30);

        triangleName.getShapeName();

        Assert.assertEquals(null, triangleName.getShapeName();
    }
    @Test
    public void testTriangleField() {
        Triangle triangleField = new Triangle("Triangle", 30);

        triangleField.getField();

        Assert.assertEquals( triangleField.getField());
    }
    @Test
    public void testSquareName() {
        Square squareName = new Square("Square",25);

        squareName.getShapeName();

        Assert.assertEquals("Square", squareName.getShapeName();
    }
    @Test
    public void testSquareField() {
        Square squareField = new Square("Square", 25);

        squareField.getField();

        Assert.assertEquals(25, squareField.getField();
    }
}