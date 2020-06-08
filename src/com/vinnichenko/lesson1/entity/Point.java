package com.vinnichenko.lesson1.entity;

import java.util.Objects;

public class Point {
    private String name;
    private double coordinateX;
    private double coordinateY;

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
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("name='").append(name).append('\'');
        sb.append(", coordinateX=").append(coordinateX);
        sb.append(", coordinateY=").append(coordinateY);
        sb.append('}');
        return sb.toString();
    }
}