package com.tieumy.exercise.OOP.Exercise01;

public class Triangle implements Shape {

    private Point top;
    private Point bottomLeft;
    private Point bottomRight;

    public Triangle() {

    }

    public double checkInsidePoint(Point pointA, Point pointB, Point pointC) {
        return (pointA.getY() - pointB.getY()) * (pointC.getX() - pointA.getX()) + (pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY());
    }

    public double calculateDistance(Point a, Point b) {
        return Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
    }

    @Override
    public double getArea() {
        return 0.5 * Math.abs((bottomLeft.getX() - top.getX()) * (bottomRight.getY() - top.getY()) - (bottomRight.getX() - top.getX()) * (bottomLeft.getY() - top.getY()));
    }

    @Override
    public double getPerimeter() {
        double leftSide = calculateDistance(bottomLeft, top);
        double rightSide = calculateDistance(bottomRight, top);
        double bottomSide = calculateDistance(bottomRight, bottomLeft);

        return leftSide + rightSide + bottomSide;
    }

    @Override
    public boolean contains(Point point) {
        if (checkInsidePoint(top, bottomLeft, point) * checkInsidePoint(top, bottomLeft, bottomRight) < 0) {
            return false;
        }

        if (checkInsidePoint(top, bottomRight, point) * checkInsidePoint(top, bottomRight, bottomLeft) < 0) {
            return false;
        }

        if (checkInsidePoint(bottomLeft, top, point) * checkInsidePoint(bottomLeft, top, bottomRight) < 0) {
            return false;
        }
        return true;
    }
}
