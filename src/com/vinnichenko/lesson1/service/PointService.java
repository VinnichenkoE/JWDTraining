package com.vinnichenko.lesson1.service;

import com.vinnichenko.lesson1.entities.Point;
import com.vinnichenko.lesson1.validator.PointValidator;

public class PointService {

    public double calculateDistance(Point point) {
        double distance = Math.hypot(point.getCoordinateX(), point.getCoordinateY());
        return distance;
    }

    public int compareDistance(Point pointA, Point pointB) {
        double distanceA = calculateDistance(pointA);
        double distanceB = calculateDistance(pointB);
        return Double.compare(distanceA, distanceB);
    }

    public String whoIsCloser(Point pointA, Point pointB) {
        PointValidator pointValidator = new PointValidator();
        if(pointValidator.isInBorders(pointA)&&pointValidator.isInBorders(pointB)){
            int compare = compareDistance(pointA, pointB);
            String result = "";
            switch (compare) {
                case -1:
                    result =  "Point " + pointA.getName() + " is closer than " + pointB.getName();
                    break;
                case 0:
                    result =  "points equidistant";
                    break;
                case 1:
                    result = "Point " + pointB.getName() + " is closer than " + pointA.getName();
                    break;
            } return result;
        }
        return "point beyond the borders";
    }
}
