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
        final double dx = point.getX() - x;
        final double dy = point.getY() - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
