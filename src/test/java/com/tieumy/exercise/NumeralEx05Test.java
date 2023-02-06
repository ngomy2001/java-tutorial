package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumeralEx05Test {

    @Test
    void sumOfEquidistantNumbers() {
        assertEquals(8, NumeralEx05.sumOfEquidistantNumbers(2));
        assertEquals(-1, NumeralEx05.sumOfEquidistantNumbers(0));
    }
}