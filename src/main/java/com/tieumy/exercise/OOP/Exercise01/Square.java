package com.tieumy.exercise.OOP.Exercise01;

public class Square extends Rectangle {
    private final double side;

    public Square(final Point topRight, final double side) {
        super(topRight, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}
