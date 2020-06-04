package com.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.validator.ShapeValidator;

public class ShapeService {

    ShapeValidator shapeValidator = new ShapeValidator();
    DigitService digitService = new DigitService();

    public String inscribeSquare(String stringGivenSquare) {
        if (shapeValidator.isPositive(stringGivenSquare)) {
            double givenSquare = Double.parseDouble(stringGivenSquare);
            double diameter = Math.sqrt(givenSquare);
            double square = Math.pow(diameter, 2) / 2;
            square = digitService.round(square, 3);
            double excess = givenSquare / square;
            excess = digitService.round(excess, 3);
            String result = "square of inscribe square is " + square + " it is " + excess + " times less than given square";
            return result;
        }
        return "incorrect data";
    }

    public String circumference(String stringRadius) {
        if (shapeValidator.isPositive(stringRadius)) {
            double radius = Double.parseDouble(stringRadius);
            double circumference = 2 * Math.PI * radius;
            circumference = digitService.round(circumference, 3);
            return "circumference is " + circumference;
        }
        return "incorrect data";
}

    public String squareOfCircle (String stringRadius){
        if(shapeValidator.isPositive(stringRadius)){
            double radius = Double.parseDouble(stringRadius);
            double squareOfCircle = Math.PI * Math.pow(radius, 2);
            squareOfCircle = digitService.round(squareOfCircle, 3);
            return "square of the circle is " + squareOfCircle;
        }
        return "incorrect data";
    }

}
