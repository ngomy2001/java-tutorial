package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumeralEx09Test {

    @Test
    void calculateSqrt() {
        final NumeralEx09 numeralEx09 = new NumeralEx09();
        assertEquals(5, numeralEx09.calculateSqrt(25), 0.0001);
    }
}