package com.tieumy.exercise.OOP.Exercise01;

public class Square extends Rectangle {
    private final double width;

    public Square(final Point topRight, final double width) {
        super(topRight, width, width);
        this.width = width;
    }
    
    public boolean contains(Point point) {
        return super.contains(point);
    }
}
