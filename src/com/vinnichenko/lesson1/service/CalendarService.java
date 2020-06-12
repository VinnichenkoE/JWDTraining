package com.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.entity.Month;
import com.vinnichenko.lesson1.exeption.ProgramException;
import com.vinnichenko.lesson1.validator.CalendarValidator;

public class CalendarService {

    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int DURATION_LEAP_YEAR_CYCLE = 4;
    private static final int NOT_LEAP_YEAR_DIVIDER = 100;
    private static final int LEAP_YEAR_DIVIDER = 400;

    public boolean isYearLeap(int year) {
        boolean result = false;
        if (year % DURATION_LEAP_YEAR_CYCLE == 0) {
            result = year % NOT_LEAP_YEAR_DIVIDER != 0 || year % LEAP_YEAR_DIVIDER == 0;
        }
        return result;
    }

    public int daysInMonth(int year, int numberOfMonth) throws ProgramException {
        CalendarValidator calendarValidator = new CalendarValidator();
        if (calendarValidator.isYearValid(year) && calendarValidator.isNumberOfMonthValid(numberOfMonth)) {
            Month month = Month.values()[numberOfMonth - 1];
            int days = month == Month.FEBRUARY && isYearLeap(year) ? month.getDays() + 1 : month.getDays();
            return days;
        } else {
            throw new ProgramException("incorrect value of input");
        }
    }

    public String passedTime(int second) throws ProgramException {
        CalendarValidator calendarValidator = new CalendarValidator();
        if (calendarValidator.isSecondValid(second)) {
            int pastSeconds = second - 1;
            int hours = pastSeconds / SECONDS_IN_HOUR;
            int hoursInSeconds = hours * SECONDS_IN_HOUR;
            int minutes = (pastSeconds - hoursInSeconds) / SECONDS_IN_MINUTE;
            int minutesInSeconds = minutes * SECONDS_IN_MINUTE;
            int seconds = pastSeconds - hoursInSeconds - minutesInSeconds;
            StringBuilder stringBuilder = new StringBuilder("Passed ").append(hours).append(" hours ")
                    .append(minutes).append(" minutes ").append(seconds).append(" seconds");
            return stringBuilder.toString();

        }
        throw new ProgramException("incorrect value of input");
    }
}
