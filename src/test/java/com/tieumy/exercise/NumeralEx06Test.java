package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumeralEx06Test {

    @Test
    void calculateSqrt() {
        final NumeralEx06 numeralEx06 = new NumeralEx06();
        assertEquals(3, numeralEx06.calculateSqrt(9.0), 0.0001);
    }
}