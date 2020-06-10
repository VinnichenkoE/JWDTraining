package test.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.exeption.ProgramException;
import com.vinnichenko.lesson1.service.ShapeService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ShapeServiceTest {

    ShapeService shapeService;

    @BeforeMethod
    public void setUp() {
        shapeService = new ShapeService();
    }

    @Test
    public void testInscribeSquare() {
        try {
            double actual = shapeService.inscribeSquare(5.40);
            double expected = 2.70;
            assertEquals(actual, expected, 0.001);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testInscribeSquareException() throws ProgramException {
        shapeService.inscribeSquare(-2.5);
    }

    @Test
    public void testExcess() {
        try {
            double actual = shapeService.excess(5.40, 2.70);
            double expected = 2.0;
            assertEquals(actual, expected, 0.001);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testExcessException() throws ProgramException {
        shapeService.excess(-2.5, 6.0);
    }

    @Test
    public void testCircumference() {
        try {
            double actual = shapeService.circumference(2.5);
            double expected = 15.708;
            assertEquals(actual, expected, 0.001);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testCircumferenceException() throws ProgramException {
        shapeService.circumference(-2.0);
    }

    @Test
    public void testSquareOfCircle() {
        try {
            double actual = shapeService.squareOfCircle(2.0);
            double expected = 12.566;
            assertEquals(actual, expected, 0.001);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testSquareOfCircleException() throws ProgramException {
        shapeService.squareOfCircle(-2.5);
    }
}