package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumeralEx04Test {

    @Test
    void sumOfFibonaci() {
        final var result = new NumeralEx04();
        assertEquals(7, result.sumOfFibonaci(3));
        assertEquals(-1, result.sumOfFibonaci(0));
        assertEquals(1, result.sumOfFibonaci(1));
    }
}