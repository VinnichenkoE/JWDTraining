package com.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.exeption.ProgramException;

public class ShapeService {

    public double inscribeSquare(Double givenSquare) throws ProgramException {
        if (givenSquare >= 0) {
            double diameter = Math.sqrt(givenSquare);
            double square = Math.pow(diameter, 2) / 2;
            return square;
        } else {
            throw new ProgramException("the square is negative");
        }
    }

    public double excess(double givenSquare, double calculateSquare) throws ProgramException {
        if (givenSquare >= 0 && calculateSquare >= 0) {
            return givenSquare / calculateSquare;
        } else {
            throw new ProgramException("the square is negative");
        }
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
