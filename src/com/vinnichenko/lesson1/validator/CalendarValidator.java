package com.vinnichenko.lesson1.validator;

public class CalendarValidator {

    LineValidator lineValidator = new LineValidator();

    public boolean isYearValid(String stringYear) {

        if (lineValidator.isInteger(stringYear)) {
            int year = Integer.parseInt(stringYear);
            if (year >= 0 && year <= 3000) {
                return true;
            }
        }
        return false;
    }

    public boolean isNumberOfMontValid(String stringMonth) {
        if (lineValidator.isInteger(stringMonth)) {
            int month = Integer.parseInt(stringMonth);
            if (month >= 1 && month <= 12) {
                return true;
            }
        }
        return false;
    }

    public boolean isSecondValid(String stringSecond) {
        if (lineValidator.isInteger(stringSecond)) {
            int second = Integer.parseInt(stringSecond);
            if (second >= 0 && second <= 86400) {
                return true;
            }
        }
        return false;
    }
}
