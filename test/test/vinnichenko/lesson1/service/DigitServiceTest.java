package test.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.service.DigitService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.testng.Assert.*;

public class DigitServiceTest {

    DigitService digitService;

    @BeforeMethod
    public void setUp() {
        digitService = new DigitService();
    }

    @Test
    public void testLastDigit() {
        int actual = digitService.lastDigit(123);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void testLastDigitOfSquareOfLastDigit() {
        int actual = digitService.lastDigitOfSquareOfLastDigit(123);
        int expected = 9;
        assertEquals(actual, expected);
    }

    @Test
    public void testTwoOrMoreEvenNumbersPositive() {
        List<Integer> numbers = new ArrayList<Integer>() {{
            add(5);
            add(48);
            add(68);
            add(96);
        }};
        boolean condition = digitService.twoOrMoreEvenNumbers(numbers);
        assertTrue(condition);
    }

    @Test
    public void testTwoOrMoreEvenNumbersNegative() {
        List<Integer> numbers = new ArrayList<Integer>() {{
            add(5);
            add(48);
            add(15);
            add(93);
        }};
        boolean condition = digitService.twoOrMoreEvenNumbers(numbers);
        assertFalse(condition);
    }

    @Test
    public void testIsPerfectPositive() {
        boolean condition = digitService.isPerfect(496);
        assertTrue(condition);
    }

    @Test
    public void testIsPerfectNegative() {
        boolean condition = digitService.isPerfect(45);
        assertFalse(condition);
    }

    @Test
    public void testCalculateCustomFunction() {
        double actual = digitService.calculateCustomFunction(12.5);
        double expected = -109.75;
        assertEquals(actual, expected, 0.001);
    }

    @Test
    public void testCalculateTanFunction() {
        Map<Double, Double> actual = digitService.calculateTanFunction(0, 45, 15);
        Map<Double, Double> expected = new TreeMap<Double, Double>() {{
            put(0D, 0D);
            put(15D, 0.2679491924311227);
            put(30D, 0.5773502691896257);
            put(45D, 0.9999999999999999);
        }};
        assertEquals(actual, expected);
    }
}