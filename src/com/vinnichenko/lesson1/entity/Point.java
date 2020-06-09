package com.vinnichenko.lesson1.entity;

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
        if (Double.compare(point.coordinateX, coordinateX) != 0) return false;
        if (Double.compare(point.coordinateY, coordinateY) != 0) return false;
        return name != null ? name.equals(point.name) : point.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(coordinateX);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(coordinateY);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
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
