package com.tieumy.exercise.OOP.Exercise01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    final Triangle triangle = new Triangle(new Point(4, 5), new Point(2, 2), new Point(8, 2));

    @Test
    void checkInsidePoint() {
//        assertEquals(18, triangle.checkInsidePoint(new Point(4, 5), new Point(2, 2), new Point(8, 2)));
//        assertEquals(8, triangle.checkInsidePoint(new Point(4, 5), new Point(4, 3), new Point(8, 2)));
//        assertEquals(14, triangle.checkInsidePoint(new Point(2, 7), new Point(4, 3), new Point(8, 2)));
    }

    @Test
    void calculateDistance() {
//        assertEquals(5, triangle.calculateDistance(new Point(4, 5), new Point(8, 2)));
//        assertEquals(6, triangle.calculateDistance(new Point(2, 2), new Point(8, 2)));
//        assertEquals(3.6, triangle.calculateDistance(new Point(4, 5), new Point(2, 2)), 0.1);
    }

    @Test
    void getArea() {
        assertEquals(9, triangle.getArea(), 0.1);
    }

    @Test
    void getPerimeter() {
        assertEquals(14.6, triangle.getPerimeter(), 0.1);
    }

    @Test
    void contains() {
        assertTrue(triangle.contains(new Point(4, 3)));
        assertFalse(triangle.contains(new Point(2, 7)));
    }
}