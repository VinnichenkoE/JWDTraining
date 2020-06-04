package com.vinnichenko.lesson1.validator;

import java.util.List;

public class DigitValidator {

    public boolean isListOfInteger(List<String> numbers) {
        int counter = 0;
        LineValidator lineValidator = new LineValidator();
        for (String stringNumber : numbers) {
            if(lineValidator.isInteger(stringNumber)){
                counter++;
            }
        }
        if (counter == numbers.size()){
            return true;
        }
        return false;
    }


}
