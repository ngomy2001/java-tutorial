package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumeralEx06Test {

    @Test
    void calculateSqrt() {
        assertEquals(3.00009155413138, NumeralEx06.calculateSqrt(9.0));
    }
}