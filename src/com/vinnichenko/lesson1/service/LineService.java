package com.vinnichenko.lesson1.service;

import java.util.Arrays;
import java.util.List;

public class LineService {

    public static final String REGEX_DELIMITER = "\\s+";

    public List<String> lineToList(String line){
         String[] numbers = line.trim().split(REGEX_DELIMITER);
        return Arrays.asList(numbers);
    }
}
