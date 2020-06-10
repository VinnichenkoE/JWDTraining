package test.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.entity.Point;
import com.vinnichenko.lesson1.exeption.ProgramException;
import com.vinnichenko.lesson1.service.PointService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointServiceTest {

    PointService pointService;

    @BeforeMethod
    public void setUp() {
        pointService = new PointService();
    }

    @Test
    public void testCalculateDistance() {
        Point point = new Point("A", 3.0, 4.0);
        double actual = pointService.calculateDistance(point);
        double expected = 5.0;
        assertEquals(actual, expected, 0.001);
    }

    @Test
    public void testCompareDistanceLess() {
        try {
            Point pointA = new Point("A", 10.5, 5.5);
            Point pointB = new Point("B", 45.3, 35.2);
            int actual = pointService.compareDistance(pointA, pointB);
            int expected = -1;
            assertEquals(actual, expected);
        } catch (ProgramException e){
            fail();
        }
    }

    @Test
    public void testCompareDistanceMore() {
        try {
            Point pointA = new Point("A", 58.2, 37.2);
            Point pointB = new Point("B", 21.3, 17.5);
            int actual = pointService.compareDistance(pointA, pointB);
            int expected = 1;
            assertEquals(actual, expected);
        } catch (ProgramException e){
            fail();
        }
    }

    @Test
    public void testCompareDistanceEqual() {
        try {
            Point pointA = new Point("A", 10.0, 5.0);
            Point pointB = new Point("B", 5.0, 10.0);
            int actual = pointService.compareDistance(pointA, pointB);
            int expected = 0;
            assertEquals(actual, expected);
        } catch (ProgramException e){
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testCompareDistanceException() throws ProgramException {
        Point pointA = new Point("A", 101.0, 5.0);
        Point pointB = new Point("B", 5.0, 10.0);
        pointService.compareDistance(pointA, pointB);
    }
}