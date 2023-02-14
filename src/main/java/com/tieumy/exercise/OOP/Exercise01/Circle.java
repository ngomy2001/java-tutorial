package com.tieumy.exercise.OOP.Exercise01;

public class Circle implements Shape {

    public final double PI = 3.14;
    private double radius;

    private Point center;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * PI;
    }

    @Override
    public boolean contains(Point point) {
        double distance = (point.getX() - center.getX()) * (point.getX() - center.getX()) + (point.getY() - center.getY()) * (point.getY() - center.getY());
        return distance <= radius * radius;
    }

}
