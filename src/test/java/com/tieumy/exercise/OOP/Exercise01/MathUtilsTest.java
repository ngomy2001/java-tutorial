package com.tieumy.exercise.OOP.Exercise01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathUtilsTest {

    @Test
    void isBetween() {
        final MathUtils mathUtils = new MathUtils();

        assertFalse(mathUtils.isBetween(11, 13, 10));
        assertFalse(mathUtils.isBetween(1, 13, 100));
        assertTrue(mathUtils.isBetween(1, 13, 10));
        assertTrue(mathUtils.isBetween(110, 133, 122));
        assertTrue(mathUtils.isBetween(122, 133, 122));
        assertTrue(mathUtils.isBetween(110, 133, 133));
    }
}