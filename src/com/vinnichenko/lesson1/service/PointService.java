package com.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.entity.Point;
import com.vinnichenko.lesson1.exeption.ProgramException;
import com.vinnichenko.lesson1.validator.PointValidator;

public class PointService {

    public double calculateDistance(Point point) {
        double distance = Math.hypot(point.getCoordinateX(), point.getCoordinateY());
        return distance;
    }

    public int compareDistance(Point pointA, Point pointB) throws ProgramException {
        PointValidator pointValidator = new PointValidator();
        if (pointValidator.isInBorders(pointA) && pointValidator.isInBorders(pointB)) {
            double distanceA = calculateDistance(pointA);
            double distanceB = calculateDistance(pointB);
            return Double.compare(distanceA, distanceB);
        } else {
            throw new ProgramException("point beyond the borders");
        }
    }
}
