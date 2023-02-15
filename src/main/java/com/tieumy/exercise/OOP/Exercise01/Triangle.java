package com.tieumy.exercise.OOP.Exercise01;

public class Triangle implements Shape {

    private double leftSide;
    private double rightSide;
    private double bottomSide;

    public Triangle() {

    }

    public Triangle(double leftSide, double rightSide, double bottomSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.bottomSide = bottomSide;
    }

    @Override
    public double getArea() {

        double halfPerimeter = getPerimeter();
        return Math.sqrt(halfPerimeter * (halfPerimeter - leftSide) * (halfPerimeter - rightSide) * (halfPerimeter - bottomSide));
    }

    @Override
    public double getPerimeter() {
        return leftSide + rightSide + bottomSide;
    }

    @Override
    public boolean contains(Point point) {
        return false;
    }
}
