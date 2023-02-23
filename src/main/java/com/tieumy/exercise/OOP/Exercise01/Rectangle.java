package com.tieumy.exercise.OOP.Exercise01;

import static com.tieumy.exercise.OOP.Exercise01.MathUtils.isBetween;

public class Rectangle implements Shape {

    private final Point topLeft;

    private final double height;

    private final double width;

    public Rectangle(final Point topLeft, final double width, final double height) {
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
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
        return isBetween(topLeft.getX(), topLeft.getX() + width, point.getX())
                && isBetween(topLeft.getY(), topLeft.getY() + height, point.getY());
    }
}
