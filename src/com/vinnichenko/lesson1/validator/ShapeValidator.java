package com.vinnichenko.lesson1.validator;

public class ShapeValidator {

    public boolean isPositive(String stringSquare) {
        LineValidator lineValidator = new LineValidator();
        if (lineValidator.isDouble(stringSquare)) {
            double square = Double.parseDouble(stringSquare);
            if (square > 0) {
                return true;
            }
        }
        return false;
    }
}
