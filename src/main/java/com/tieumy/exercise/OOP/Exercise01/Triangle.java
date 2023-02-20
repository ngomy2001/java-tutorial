package com.tieumy.exercise.OOP.Exercise01;

public class Triangle implements Shape {

    private final Point top;
    private final Point bottomLeft;
    private final Point bottomRight;

    public Triangle(final Point top, final Point bottomLeft, final Point bottomRight) {
        this.top = top;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    public double checkInsidePoint(final Point pointA, final Point pointB, final Point pointC) {
        return (pointA.getY() - pointB.getY()) * (pointC.getX() - pointA.getX()) + (pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY());
    }

//    public double calculateDistance(final Point a, final Point b) {
//        return Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
//    }

    @Override
    public double getArea() {
        return 0.5 * Math.abs((bottomLeft.getX() - top.getX()) * (bottomRight.getY() - top.getY()) - (bottomRight.getX() - top.getX()) * (bottomLeft.getY() - top.getY()));
    }

    @Override
    public double getPerimeter() {
        final double leftSide = Point.distanceTo(bottomLeft, top);
        final double rightSide = Point.distanceTo(bottomRight, top);
        final double bottomSide = Point.distanceTo(bottomRight, bottomLeft);

        return leftSide + rightSide + bottomSide;
    }

    @Override
    public boolean contains(final Point point) {
        if (checkInsidePoint(top, bottomLeft, point) * checkInsidePoint(top, bottomLeft, bottomRight) < 0) {
            return false;
        }

        if (checkInsidePoint(top, bottomRight, point) * checkInsidePoint(top, bottomRight, bottomLeft) < 0) {
            return false;
        }

        return checkInsidePoint(bottomLeft, top, point) * checkInsidePoint(bottomLeft, top, bottomRight) >= 0;
    }
}
