package com.vinnichenko.lesson1.main;

import com.vinnichenko.lesson1.console.Console;
import com.vinnichenko.lesson1.service.ShapeService;

public class ShapeMain {
    public static void main(String[] args) {

        String givenSquare = "10.535";
        ShapeService shapeService = new ShapeService();
        String result = shapeService.inscribeSquare(givenSquare);
        Console console = new Console();
        console.printResult(result);

        String radius = "5.265";
        String length = shapeService.circumference(radius);
        console.printResult(length);
        String square = shapeService.squareOfCircle(radius);
        console.printResult(square);

    }
}
