package com.tieumy.exercise.OOP.Exercise01;

public class Rectangle implements Shape {
    private Point topRight;


    private double length;

    private double width;

    public Rectangle() {

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(Point topRight, double length, double width) {
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
    public boolean contains(Point point) {
        Point bottomLeft = new Point();
        bottomLeft.setX(topRight.getX() - length);
        bottomLeft.setY(topRight.getY() - width);

        if (!(point.getX() > bottomLeft.getX()) && point.getX() < topRight.getX()) {
            return false;
        }

        if (!(point.getY() > bottomLeft.getY() && point.getY() < topRight.getY())) {
            return false;
        }
        return true;
    }
}
