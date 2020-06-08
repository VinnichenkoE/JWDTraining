package com.vinnichenko.lesson1.parser;

import com.vinnichenko.lesson1.exeption.ProgramException;
import com.vinnichenko.lesson1.validator.DigitValidator;
import com.vinnichenko.lesson1.validator.LineValidator;

import java.util.ArrayList;
import java.util.List;

public class InputParser {
    public int stringToInt(String number) throws ProgramException {
        LineValidator lineValidator = new LineValidator();
        int result;
        if (lineValidator.isInteger(number)) {
            result = Integer.parseInt(number);
        } else {
            throw new ProgramException("incorrect format of input");
        }
        return result;
    }

    public double stringToDouble(String number) throws ProgramException {
        double result;
        LineValidator lineValidator = new LineValidator();
        if (lineValidator.isDouble(number)) {
            result = Double.parseDouble(number);
        } else {
            throw new ProgramException("incorrect format of input");
        }
        return result;
    }

    public List<Integer> listOfStringsToListOfIntegers (List<String> strings) throws ProgramException {
        DigitValidator digitValidator = new DigitValidator();
        List<Integer> numbers = new ArrayList<>();
        if (digitValidator.isListOfInteger(strings)){
            for (String string : strings) {
                int number = Integer.parseInt(string);
                numbers.add(number);
            }
            return numbers;
        } else {
            throw new ProgramException("incorrect data");
        }
    }
}
