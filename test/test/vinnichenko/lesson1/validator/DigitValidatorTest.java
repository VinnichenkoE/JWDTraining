package test.vinnichenko.lesson1.validator;

import com.vinnichenko.lesson1.validator.DigitValidator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class DigitValidatorTest {

    DigitValidator digitValidator;

    @BeforeMethod
    public void setUp() {
        digitValidator = new DigitValidator();
    }

    @Test
    public void testIsListOfIntegerPositive() {
        List<String> numbers = new ArrayList<String>() {{
            add("15");
            add("25");
            add("12");
            add("126");
        }};
        boolean condition = digitValidator.isListOfInteger(numbers);
        assertTrue(condition);
    }

    @Test
    public void testIsListOfIntegersNegative() {
        List<String> numbers = new ArrayList<String>() {{
            add("sds");
            add("156");
            add("ds");
            add("12");
        }};
        boolean condition = digitValidator.isListOfInteger(numbers);
        assertFalse(condition);
    }
}