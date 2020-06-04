package com.vinnichenko.lesson1.validator;

import java.util.List;

public class LineValidator {
    public static final String REGEX_INTEGER = "[-]?\\d+";
    public static final String REGEX_DOUBLE = "[-]?\\d+[.]?\\d+";

    public boolean isInteger(String input) {
        if (input.matches(REGEX_INTEGER)) {
            return true;
        }
        return false;
    }

    public boolean isDouble(String input) {
        if (input.matches(REGEX_DOUBLE)) {
            return true;
        }
        return false;
    }
}
