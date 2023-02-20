package com.tieumy.exercise.OOP.Exercise01;

public class Point {
    private final double x;
    private final double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(final Point point) {
        double squareDistance = point.getX() - getX() * (point.getX() - getX()) + (point.getY() - getY()) * (point.getY() - getY());
        return Math.sqrt(squareDistance);
    }
}
