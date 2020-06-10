package com.vinnichenko.lesson1.validator;

public class CalendarValidator {

    private static final int SECONDS_PER_DAY = 86400;

    public boolean isYearValid(int year) {
        return year >= 0 && year <= 3000;
    }

    public boolean isNumberOfMonthValid(int month) {
        return month >= 1 && month <= 12;
    }

    public boolean isSecondValid(int second) {
        return second >= 0 && second <= SECONDS_PER_DAY;
    }
}
