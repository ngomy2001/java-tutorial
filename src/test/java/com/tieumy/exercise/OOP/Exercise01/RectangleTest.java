package com.tieumy.exercise.OOP.Exercise01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    final Rectangle rectangle = new Rectangle(new Point(2, 3), 4, 5);

    @Test
    void getLength() {
        assertEquals(5, rectangle.getHeight());
    }

    @Test
    void getWidth() {
        assertEquals(4, rectangle.getWidth());
    }

    @Test
    void getArea() {
        assertEquals(20, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(18, rectangle.getPerimeter());
    }

    @Test
    void contains() {
        assertTrue(rectangle.contains(new Point(0, 0)));
        assertFalse(rectangle.contains(new Point(1, 6)));
    }
}