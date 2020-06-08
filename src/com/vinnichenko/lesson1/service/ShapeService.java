package com.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.exeption.ProgramException;

public class ShapeService {

    public double inscribeSquare(Double givenSquare) throws ProgramException {
        double square;
        if (givenSquare >= 0) {
            double diameter = Math.sqrt(givenSquare);
            square = Math.pow(diameter, 2) / 2;
        } else {
            throw new ProgramException("the square is negative");
        }
        return square;
    }

    public double excess(double givenSquare, double calculateSquare){
        return givenSquare/calculateSquare;
    }

    public double circumference(double radius) throws ProgramException {
        if (radius >= 0) {
            double circumference = 2 * Math.PI * radius;
            return circumference;
        } else {
            throw new ProgramException("the radius is negative");
        }

    }

    public double squareOfCircle(double radius) throws ProgramException {
        if (radius >= 0) {
            double squareOfCircle = Math.PI * Math.pow(radius, 2);
            return squareOfCircle;
        } else {
            throw new ProgramException("the radius is negative");
        }

    }

}
