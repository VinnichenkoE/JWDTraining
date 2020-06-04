package com.vinnichenko.lesson1.main;

import com.vinnichenko.lesson1.console.Console;
import com.vinnichenko.lesson1.entities.Point;
import com.vinnichenko.lesson1.service.PointService;

public class PointMain {
    public static void main(String[] args) {
        Point pointA = new Point("A", 12,1);
        Point pointB = new Point("B", 1,15);
        PointService pointService = new PointService();
        String result = pointService.whoIsCloser(pointA,pointB);
        Console console = new Console();
        console.printResult(result);
    }
}
