package com.tieumy.exercise.OOP.Exercise01;

public class Circle implements Shape {
    private final double radius;

    private final Point center;

    public Circle(final double radius, final Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public boolean contains(final Point point) {
        final double squareDistance = (point.getX() - center.getX()) * (point.getX() - center.getX()) + (point.getY() - center.getY()) * (point.getY() - center.getY());
        return squareDistance <= radius * radius;
    }

}
