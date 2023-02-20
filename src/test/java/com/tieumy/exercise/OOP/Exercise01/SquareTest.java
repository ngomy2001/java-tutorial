package com.tieumy.exercise.OOP.Exercise01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    final Square square = new Square(new Point(4, 5), 3);

    @Test
    void getSide() {
        assertEquals(3, square.getSide());
    }
}