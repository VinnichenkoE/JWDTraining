package com.vinnichenko.lesson1.validator;

import com.vinnichenko.lesson1.entity.Point;

public class PointValidator {

    private static final int MAX_POINT_BORDER = 100;
    private static final int MIN_POINT_BORDER = -100;

    public boolean isInBorders(Point point) {
        boolean result = false;
        if (point.getCoordinateX() >= MIN_POINT_BORDER && point.getCoordinateX() <= MAX_POINT_BORDER &&
                point.getCoordinateY() >= MIN_POINT_BORDER && point.getCoordinateY() <= MAX_POINT_BORDER) {
            result = true;
        }
        return result;
    }
}
