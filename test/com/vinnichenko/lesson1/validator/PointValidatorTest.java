package com.vinnichenko.lesson1.validator;

import com.vinnichenko.lesson1.entity.Point;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PointValidatorTest {

    PointValidator pointValidator;

    @BeforeClass
    public void setUp() {
        pointValidator = new PointValidator();
    }


    @Test
    public void testIsInBordersPositive() {
        Point point = new Point("A", 10.5, 45.0);
        boolean condition = pointValidator.isInBorders(point);
        assertTrue(condition);
    }

    @Test
    public void testIsInBordersNegative() {
        Point point = new Point("B", 101.0, 12.5);
        boolean condition = pointValidator.isInBorders(point);
        assertFalse(condition);
    }
}