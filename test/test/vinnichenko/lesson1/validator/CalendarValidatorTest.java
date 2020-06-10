package test.vinnichenko.lesson1.validator;

import com.vinnichenko.lesson1.validator.CalendarValidator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalendarValidatorTest {

    CalendarValidator calendarValidator;

    @BeforeMethod
    public void setUp() {
        calendarValidator = new CalendarValidator();
    }

    @Test
    public void testIsYearValidPositive() {
        boolean condition = calendarValidator.isYearValid(2020);
        assertTrue(condition);
    }
    @Test
    public void testIsYearValidNegative() {
        boolean condition = calendarValidator.isYearValid(-150);
        assertFalse(condition);
    }

    @Test
    public void testIsNumberOfMonthValidPositive() {
        boolean condition = calendarValidator.isNumberOfMonthValid(5);
        assertTrue(condition);
    }

    @Test
    public void testIsNumberOfMonthValidNegative() {
        boolean condition = calendarValidator.isNumberOfMonthValid(13);
        assertFalse(condition);
    }

    @Test
    public void testIsSecondValidPositive() {
        boolean condition = calendarValidator.isSecondValid(65_000);
        assertTrue(condition);
    }

    @Test
    public void testIsSecondValidNegative(){
        boolean condition = calendarValidator.isSecondValid(105_000);
        assertFalse(condition);
    }
}