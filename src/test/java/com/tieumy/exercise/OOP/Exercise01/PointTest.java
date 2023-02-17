package com.tieumy.exercise.OOP.Exercise01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PointTest {
    final Point a = new Point(2, 7);
    final Point b = new Point(3, 4);

    final Point c = new Point(-3, 5);

    @Test
    void getX() {
        assertEquals(2, a.getX());
        assertEquals(3, b.getX());
        assertEquals(-3, c.getX());
    }

    @Test
    void setX() {
    }

    @Test
    void getY() {
        assertEquals(7, a.getY());
        assertEquals(4, b.getY());
        assertEquals(5, c.getY());
    }

}