package com.vinnichenko.lesson1.validator;

public class CalendarValidator {

    public boolean isYearValid(int year) {
        return year >= 0 && year <= 3000;
    }

    public boolean isNumberOfMonthValid(int month) {
        return month >= 1 && month <= 12;
    }

    public boolean isSecondValid(int second) {
        return second >= 0 && second <= 86400;
    }
}
