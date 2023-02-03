package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumeralEx01Test {

    @Test
    void findGCD() {
        final var foundGCD = new NumeralEx01();
        assertEquals(3, foundGCD.findGCD(3, 6));

    }

    @Test
    void findLCM() {
        final var foundLCM = new NumeralEx01();
        assertEquals(35, foundLCM.findLCM(5, 7));
    }
}