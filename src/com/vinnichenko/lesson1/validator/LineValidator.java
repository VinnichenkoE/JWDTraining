package com.vinnichenko.lesson1.validator;

public class LineValidator {
    public static final String REGEX_INTEGER = "\\-?\\d+";
    public static final String REGEX_DOUBLE = "\\-?\\d+\\.?\\d+";

    public boolean isInteger(String input) {
        return input.matches(REGEX_INTEGER);
    }

    public boolean isDouble(String input) {
        return input.matches(REGEX_DOUBLE);
    }
}
