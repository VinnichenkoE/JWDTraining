package com.vinnichenko.lesson1.service;

import java.util.Arrays;
import java.util.List;

public class LineService {

    public static final String REGEX_DELIMETR = "\\s+";

    public List<String> lineToList(String line){
         String[] numbers = line.trim().split(REGEX_DELIMETR);
        return Arrays.asList(numbers);
    }
}
