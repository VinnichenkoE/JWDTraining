package com.vinnichenko.lesson1.console;

import com.vinnichenko.lesson1.entity.Point;

import java.util.Map;

public class Console {
    public void printLastDigitOfSquareOfLastDigit(int lastDigit, int number) {
        StringBuilder stringBuilder = new StringBuilder("Last digit of square of last digit ");
        stringBuilder.append(number).append(" is ").append(lastDigit);
        System.out.println(stringBuilder);
    }

    public void printNumberDaysInMonth(int days) {
        StringBuilder stringBuilder = new StringBuilder("In this month ").append(days).append(" days");
        System.out.println(stringBuilder);
    }

    public void printInscribeSquare(double square, double excess) {
        StringBuilder stringBuilder = new StringBuilder("Square of inscribe circle is ").
                append(square).append(" it is in ").append(excess).append(" times less than given square");
        System.out.println(stringBuilder);
    }

    public void printResult(boolean result) {
        System.out.println(result);
    }

    public void printResult(String result) {
        System.out.println(result);
    }

    public void printWhoIsCloser(int result, Point pointA, Point pointB) {
        String output = "";

        switch (result) {
            case -1:
                output = "Point " + pointA.getName() + " is closer than " + pointB.getName();
                break;
            case 0:
                output = "points equidistant";
                break;
            case 1:
                output = "Point " + pointB.getName() + " is closer than " + pointA.getName();
                break;
        }
        System.out.println(output);
    }

    public void printFunctionValue(double value) {
        StringBuilder stringBuilder = new StringBuilder("The function value is ").append(value);
        System.out.println(stringBuilder);
    }

    public void printSquareAndCircumference(double square, double circumference) {
        StringBuilder stringBuilder = new StringBuilder("square of the circle is ").
                append(square).append(" circumference is ").append(circumference);
        System.out.println(stringBuilder);
    }

    public void printTable(Map<Double, Double> values) {
        for (Map.Entry<Double, Double> entry : values.entrySet()) {
            System.out.printf("%8.3f %8.3f %n", entry.getKey(), entry.getValue());
        }
    }
}
