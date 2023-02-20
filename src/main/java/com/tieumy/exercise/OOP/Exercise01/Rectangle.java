package com.tieumy.exercise.OOP.Exercise01;

public class Rectangle implements Shape {

    private final Point topRight;

    private final double height;

    private final double width;


    public double getLength() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(final double width, final double height, final Point topRight) {
        this.width = width;
        this.height = height;
        this.topRight = topRight;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }

    @Override
    public boolean contains(final Point point) {
        final Point bottomLeft = new Point(topRight.getX() - height, topRight.getY() - width);

        return point.getX() >= bottomLeft.getX() &&
                point.getX() <= topRight.getX() &&
                point.getY() >= bottomLeft.getY() &&
                point.getY() <= topRight.getY();
    }
}
