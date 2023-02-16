package com.tieumy.exercise.OOP.Exercise01;

public class Rectangle implements Shape {
    private final Point topRight;


    private final double length;

    private final double width;


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(final Point topRight, final double length, final double width) {
        this.topRight = topRight;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public boolean contains(final Point point) {
        Point bottomLeft = new Point();
        bottomLeft.setX(topRight.getX() - length);
        bottomLeft.setY(topRight.getY() - width);

        if (!(point.getX() > bottomLeft.getX()) && point.getX() < topRight.getX()) {
            return false;
        }

        return point.getY() > bottomLeft.getY() && point.getY() < topRight.getY();
    }
}
