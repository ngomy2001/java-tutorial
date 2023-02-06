package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumeralEx05Test {

    @Test
    void sumOfEquidistantNumbers() {
        final var sumOfInput = new NumeralEx05();
        assertEquals(8, sumOfInput.sumOfEquidistantNumbers(2));
        assertEquals(-1, sumOfInput.sumOfEquidistantNumbers(0));
    }
}