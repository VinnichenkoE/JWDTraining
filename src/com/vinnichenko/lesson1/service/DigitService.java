package com.vinnichenko.lesson1.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DigitService {

    public int lastDigit(int number) {
        return number % 10;
    }

    public int lastDigitOfSquareOfLastDigit(int number) {
        int lastDigit = lastDigit(number);
        int squareOfLastDigit = (int) Math.pow(lastDigit, 2);
        int result = lastDigit(squareOfLastDigit);
        return result;

    }

    public boolean moreThanTwoEven(List<Integer> numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                counter++;
            }
        }
        return counter >= 2;
    }

    public boolean isPerfect(int number) {
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count += i;
            }
        }
        return number == count;


    }

    public double calculateFunction(double argument) {
        double value;
        if (argument >= 3) {
            value = -Math.pow(argument, 2) + 3 * argument + 9;
        } else {
            value = 1 / (Math.pow(argument, 3) - 6);
        }
        return value;
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
