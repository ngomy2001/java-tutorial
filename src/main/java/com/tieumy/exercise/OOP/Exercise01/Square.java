package com.tieumy.exercise.OOP.Exercise01;

public class Square implements Shape {

    private double side;
    

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public boolean contains(Point point) {
        return false;
    }
}
