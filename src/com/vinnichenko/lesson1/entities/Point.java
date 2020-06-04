package com.vinnichenko.lesson1.entities;

import java.util.Objects;

public class Point {
    String name;
    double coordinateX;
    double coordinateY;

    public Point(String name, double coordinateX, double coordinateY) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public String getName() {
        return name;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.coordinateX, coordinateX) == 0 &&
                Double.compare(point.coordinateY, coordinateY) == 0 &&
                Objects.equals(name, point.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, coordinateX, coordinateY);
    }

    @Override
    public String toString() {
        return "Point{" +
                "name='" + name + '\'' +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
