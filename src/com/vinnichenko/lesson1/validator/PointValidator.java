package com.vinnichenko.lesson1.validator;

import com.vinnichenko.lesson1.entities.Point;

public class PointValidator {
    public boolean isInBorders(Point point) {
        if (point.getCoordinateX() >= -100 && point.getCoordinateX() <= 100 &&
                point.getCoordinateY() >= -100 && point.getCoordinateY() <= 100) {
            return true;
        }
        return false;
    }
}
