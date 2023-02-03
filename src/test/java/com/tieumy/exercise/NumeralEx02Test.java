package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumeralEx02Test {

    @Test
    void calculateSumOfIntegers() {
        final var sumOfInput = new NumeralEx02();
        assertEquals(6, sumOfInput.calculateSumOfIntegers(123));
    }
}