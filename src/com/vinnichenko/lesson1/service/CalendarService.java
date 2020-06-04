package com.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.entities.Months;
import com.vinnichenko.lesson1.validator.CalendarValidator;

public class CalendarService {

    CalendarValidator calendarValidator = new CalendarValidator();

    public boolean isYearLeap(String stringYear) {
        int year = Integer.parseInt(stringYear);
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public String daysInMonth(String year, String stringMonth) {
        if (calendarValidator.isYearValid(year) && calendarValidator.isNumberOfMontValid(stringMonth)) {
            int month = Integer.parseInt(stringMonth);
            int days;
            if (month == 2 && isYearLeap(year)) {
                days = Months.values()[month - 1].getDays() + 1;
                return Integer.toString(days);
            }
            days = Months.values()[month - 1].getDays();
            return Integer.toString(days);
        }
        return "incorrect data";
    }

    public String passedTime(String stringSecond) {
        if (calendarValidator.isSecondValid(stringSecond)) {
            int currentSecond = Integer.parseInt(stringSecond);
            int pastSeconds = currentSecond - 1;
            int hours = pastSeconds / 3600;
            int hoursInSeconds = hours * 3600;
            int minutes = (pastSeconds - hoursInSeconds) / 60;
            int minutesInSeconds = minutes * 60;
            int seconds = pastSeconds - hoursInSeconds - minutesInSeconds;
            String result = "Passed " + hours + " hours " + minutes + " minutes " + seconds + " seconds";
            return result;

        }
        return "incorrect data";
    }
}
