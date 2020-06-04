package com.vinnichenko.lesson1.main;

import com.vinnichenko.lesson1.console.Console;
import com.vinnichenko.lesson1.service.DigitService;
import com.vinnichenko.lesson1.service.LineService;

import java.util.List;
import java.util.Map;

public class DigitMain {
    public static void main(String[] args) {
        String str = "123";
        DigitService digitService = new DigitService();
        String result = digitService.lastDigitOfSquareOfLastDigit(str);
        Console console = new Console();
        console.printResult(result);

        String line = " 5 -25 2 15";
        LineService lineService = new LineService();
        List<String> numbers = lineService.lineToList(line);
        String lineResult = digitService.moreThanTwoEven(numbers);
        console.printResult(lineResult);

        String stringNumber = "-6";
        String numberResult = digitService.isPerfect(stringNumber);
        console.printResult(numberResult);

        String argument = "15.657852";
        String valueOfFunction = digitService.calculateFunction(argument);
        console.printResult(valueOfFunction);

        Map<Double,Double> values = digitService.calculateTanFunction(-15,45,5.0);
        console.printTable(values);
    }
}