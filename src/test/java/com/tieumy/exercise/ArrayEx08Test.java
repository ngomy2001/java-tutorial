package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayEx08Test {

    @Test
    void sumOfSquares() {
        final ArrayEx08 arrayEx08 = new ArrayEx08();
        assertEquals(10, arrayEx08.sumOfSquares(new int[]{1, 0, 3}));
    }
}