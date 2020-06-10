package test.vinnichenko.lesson1.validator;

import com.vinnichenko.lesson1.validator.LineValidator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LineValidatorTest {

    LineValidator lineValidator;

    @BeforeMethod
    public void setUp() {
        lineValidator = new LineValidator();
    }

    @Test
    public void testIsIntegerPositive() {
        boolean condition = lineValidator.isInteger("12");
        assertTrue(condition);
    }

    @Test
    public void testIsIntegerNegative(){
        boolean condition = lineValidator.isInteger("asd");
        assertFalse(condition);
    }

    @Test
    public void testIsDoublePositive() {
        boolean condition = lineValidator.isDouble("12.5");
        assertTrue(condition);
    }

    @Test
    public void testIsDoubleNegative() {
        boolean condition = lineValidator.isDouble("dasd");
        assertFalse(condition);
    }
}