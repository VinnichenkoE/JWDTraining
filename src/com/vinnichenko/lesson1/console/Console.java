package com.vinnichenko.lesson1.console;

import java.util.Map;

public class Console {
    public void printResult(String result) {
        System.out.println(result);
    }

    public void printTable(Map<Double,Double> values){
        for(Map.Entry<Double, Double> entry: values.entrySet()){
            System.out.printf("%8.3f %8.3f %n", entry.getKey(), entry.getValue());

        }
    }
}
