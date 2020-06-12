package com.vinnichenko.lesson1.validator;

public class CalendarValidator {

    private static final int SECONDS_PER_DAY = 86400;
    private static final int MAX_NUMBER_OF_YEAR = 3000;

    public boolean isYearValid(int year) {
        return year >= 0 && year <= MAX_NUMBER_OF_YEAR;
    }

    public boolean isNumberOfMonthValid(int month) {
        return month >= 1 && month <= 12;
    }

    public boolean isSecondValid(int second) {
        return second >= 0 && second <= SECONDS_PER_DAY;
    }
}
