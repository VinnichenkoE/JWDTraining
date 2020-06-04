package com.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.validator.DigitValidator;
import com.vinnichenko.lesson1.validator.LineValidator;

import java.math.BigDecimal;
import java.util.*;

public class DigitService {

    LineValidator lineValidator = new LineValidator();
    DigitValidator digitValidator = new DigitValidator();

    public String lastDigit(String number) {
        return number.substring(number.length() - 1);
    }

    public String lastDigitOfSquareOfLastDigit(String number) {

        if (lineValidator.isInteger(number)) {
            String lastDigit = lastDigit(number);
            int intLastDigit = Integer.parseInt(lastDigit);
            int squareOfLastDigit = intLastDigit * intLastDigit;
            String stringSquare = Integer.toString(squareOfLastDigit);
            String result = lastDigit(stringSquare);
            return result;
        }
        return "incorrect data";
    }

    public Double round(Double value, int range) {
        return new BigDecimal(value).setScale(range, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public String moreThanTwoEven(List<String> numbers) {
        if (digitValidator.isListOfInteger(numbers)) {
            int counter = 0;
            for (String stringNumber : numbers) {
                int number = Integer.parseInt(stringNumber);
                if (number % 2 == 0) {
                    counter++;
                }
            }
            if (counter >= 2) {
                return "true";
            } else return "false";
        }
        return "incorrect data";
    }

    public String isPerfect(String stringNumber) {
        if (lineValidator.isInteger(stringNumber)) {
            int number = Integer.parseInt(stringNumber);
            int count = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    count += i;
                }
            }
            if (count == number) {
                return "true";
            } else return "false";

        }
        return "incorrect data";
    }

    public String calculateFunction(String stringArgument) {
        lineValidator.isDouble(stringArgument);
        double argument = Double.parseDouble(stringArgument);
        double value;
        if (argument >= 3) {
            value = -Math.pow(argument, 2) + 3 * argument + 9;
        } else {
            value = 1 / (Math.pow(argument, 3) - 6);
        }
        value = round(value, 3);
        String result = Double.toString(value);
        return result;
    }

    public Map<Double, Double> calculateTanFunction(double start, double end, double step) {
        double argument = start;
        Map<Double, Double> values = new TreeMap<>();
        while (argument <= end) {
            double functionValue = Math.tan(Math.toRadians(argument));
            values.put(argument, functionValue);
            argument += step;
        }
        return values;
    }
}
