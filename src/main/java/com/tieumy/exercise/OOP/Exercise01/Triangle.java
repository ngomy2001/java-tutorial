package com.tieumy.exercise.OOP.Exercise01;

public class Triangle implements Shape {

    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(final Point a, final Point b, final Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double halfSideDelta(final Point pointA, final Point pointB, final Point pointC) {
        return (pointA.getY() - pointB.getY()) * (pointC.getX() - pointA.getX()) + (pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY());
    }

    @Override
    public double getArea() {
        return 0.5 * Math.abs((b.getX() - a.getX()) * (c.getY() - a.getY()) - (c.getX() - a.getX()) * (b.getY() - a.getY()));
    }

    @Override
    public double getPerimeter() {
        final double leftSide = b.distanceTo(a);
        final double rightSide = c.distanceTo(a);
        final double bottomSide = c.distanceTo(b);

        return leftSide + rightSide + bottomSide;
    }

    @Override
    public boolean contains(final Point point) {
        if (checkInsidePoint(a, b, point) * checkInsidePoint(a, b, c) < 0) {
            return false;
        }

        if (checkInsidePoint(a, c, point) * checkInsidePoint(a, c, b) < 0) {
            return false;
        }

        return checkInsidePoint(b, a, point) * checkInsidePoint(b, a, c) >= 0;
    }
}
