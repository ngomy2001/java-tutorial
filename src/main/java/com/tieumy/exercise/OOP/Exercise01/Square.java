package com.tieumy.exercise.OOP.Exercise01;

public class Square extends Rectangle {
    private Point topRight;
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square() {

    }

    @Override
    public double getArea() {

        return side * side;
    }

    @Override
    public double getPerimeter() {

        return side * 4;
    }

    @Override
    public boolean contains(Point point) {
        Point bottomLeft = new Point();
        bottomLeft.setX(topRight.getX() - side);
        bottomLeft.setY(topRight.getY() - side);

        if (!(point.getX() > bottomLeft.getX()) && point.getX() < topRight.getX()) {
            return false;
        }

        if (!(point.getY() > bottomLeft.getY() && point.getY() < topRight.getY())) {
            return false;
        }
        return true;
    }
}
