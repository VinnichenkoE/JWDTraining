package com.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.entity.Month;
import com.vinnichenko.lesson1.exeption.ProgramException;
import com.vinnichenko.lesson1.validator.CalendarValidator;

public class CalendarService {

    public boolean isYearLeap(int year) {
        boolean result = false;
        if (year % 4 == 0) {
            result = year % 100 != 0 || year % 400 == 0;
        }
        return result;
    }

    public int daysInMonth(int year, int month) throws ProgramException {
        int days;
        CalendarValidator calendarValidator = new CalendarValidator();
        if (calendarValidator.isYearValid(year) && calendarValidator.isNumberOfMonthValid(month)) {
            days = Month.values()[month - 1].getDays();
        } else {
            throw new ProgramException("incorrect value of the date");
        }
        if (month == 2 && isYearLeap(year)) {
            days++;
        }
        return days;
    }

    public String passedTime(int second) throws ProgramException {
        CalendarValidator calendarValidator = new CalendarValidator();
        if (calendarValidator.isSecondValid(second)) {
            int pastSeconds = second - 1;
            int hours = pastSeconds / 3600;
            int hoursInSeconds = hours * 3600;
            int minutes = (pastSeconds - hoursInSeconds) / 60;
            int minutesInSeconds = minutes * 60;
            int seconds = pastSeconds - hoursInSeconds - minutesInSeconds;
            String result = "Passed " + hours + " hours " + minutes + " minutes " + seconds + " seconds";
            return result;

        }
        throw new ProgramException("incorrect value of second");
    }
}
