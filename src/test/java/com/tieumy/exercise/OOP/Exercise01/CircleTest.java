package com.tieumy.exercise.OOP.Exercise01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CircleTest {
    final Circle circle = new Circle(5, new Point(2, 2));

    @Test
    void getRadius() {
        assertEquals(5, circle.getRadius());

    }

    @Test
    void getCenter() {
        assertEquals(2, circle.getCenter().getX());
        assertEquals(2, circle.getCenter().getY());
    }

    @Test
    void getArea() {
        assertEquals(78.5, circle.getArea(), 0.1);
    }

    @Test
    void getPerimeter() {
        assertEquals(31.4, circle.getPerimeter(), 0.1);
    }

    @Test
    void contains() {
        assertFalse(circle.contains(new Point(0, 7)));
        assertTrue(circle.contains(new Point(2, 3)));
    }
}