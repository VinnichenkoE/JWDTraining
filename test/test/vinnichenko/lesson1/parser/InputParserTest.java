package test.vinnichenko.lesson1.parser;

import com.vinnichenko.lesson1.exeption.ProgramException;
import com.vinnichenko.lesson1.parser.InputParser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class InputParserTest {

    InputParser inputParser;

    @BeforeMethod
    public void setUp() {
        inputParser = new InputParser();
    }

    @Test
    public void testStringToInt() {
        try {
            int actual = inputParser.stringToInt("12");
            int expected = 12;
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testStringToIntException() throws ProgramException {
        inputParser.stringToInt("dasd");
    }

    @Test
    public void testStringToDouble() {
        try {
            double actual = inputParser.stringToDouble("12.5");
            double expected = 12.5;
            assertEquals(actual, expected);
        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testStringToDoubleException() throws ProgramException {
        inputParser.stringToInt("dasd");
    }

    @Test
    public void testListOfStringsToListOfIntegers() {
        List<String> numbers = new ArrayList<String>() {{
            add("12");
            add("25");
            add("123");
            add("32");
        }};
        try {
            List<Integer> actual = inputParser.listOfStringsToListOfIntegers(numbers);
            List<Integer> expected = new ArrayList<Integer>() {{
                add(12);
                add(25);
                add(123);
                add(32);
            }};
            assertEquals(actual, expected);

        } catch (ProgramException e) {
            fail();
        }
    }

    @Test(expectedExceptions = ProgramException.class)
    public void testListOfStringsToListOfIntegersException() throws ProgramException {
        List<String> numbers = new ArrayList<String>() {{
            add("sd");
            add("25");
            add("dsa");
            add("32");
        }};
        inputParser.listOfStringsToListOfIntegers(numbers);
    }
}