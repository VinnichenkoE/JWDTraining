package test.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.exeption.ProgramException;
import com.vinnichenko.lesson1.service.CalendarService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalendarServiceTest {

    CalendarService calendarService;

    @BeforeClass
    public void setUp() {
        calendarService = new CalendarService();
    }

    @Test
    public void testDaysInMonth() throws ProgramException {
        int actual = calendarService.daysInMonth(1963, 5);
        int expected = 31;
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testDaysInMonthException() throws ProgramException {
        calendarService.daysInMonth(2012, 13);
    }

    @Test
    public void testDaysInMonthLeapYear() throws ProgramException {
        int actual = calendarService.daysInMonth(2020, 2);
        int expected = 29;
        assertEquals(actual,expected);
    }

    @Test
    public void testDaysInMonthNotLeapYear() throws ProgramException {
        int actual = calendarService.daysInMonth(2019, 2);
        int expected = 28;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsYearLeapPositive() {
        boolean condition = calendarService.isYearLeap(2020);
        assertTrue(condition);
    }

    @Test
    public void testIsYearLeapNegative() {
        boolean condition = calendarService.isYearLeap(2019);
        assertFalse(condition);
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testPassedTimeException() throws ProgramException {
        calendarService.passedTime(90_000);
    }

    @Test
    public void testPassedTime(){
        try {
            String actual = calendarService.passedTime(60_000);
            String expected = "Passed 16 hours 39 minutes 59 seconds";
            assertEquals(actual, expected);
        } catch (ProgramException e){
            fail();
        }
    }
}