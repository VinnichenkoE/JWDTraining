package com.vinnichenko.lesson1.validator;

import com.vinnichenko.lesson1.entity.Point;

public class PointValidator {
    public boolean isInBorders(Point point) {
        boolean result = false;
        if (point.getCoordinateX() >= -100 && point.getCoordinateX() <= 100 &&
                point.getCoordinateY() >= -100 && point.getCoordinateY() <= 100) {
            result = true;
        }
        return result;
    }
}
