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
}