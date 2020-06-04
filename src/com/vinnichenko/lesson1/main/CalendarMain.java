package com.vinnichenko.lesson1.main;

import com.vinnichenko.lesson1.console.Console;
import com.vinnichenko.lesson1.service.CalendarService;

public class CalendarMain {
    public static void main(String[] args) {
        String year = "2jk";
        String month = "6";
        CalendarService calendarService = new CalendarService();
        String result = calendarService.daysInMonth(year, month);
        Console console = new Console();
        console.printResult(result);

        String second = "62500";
        String passedTime = calendarService.passedTime(second);
        console.printResult(passedTime);
    }

}
