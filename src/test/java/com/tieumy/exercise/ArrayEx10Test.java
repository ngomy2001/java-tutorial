package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayEx10Test {

    @Test
    void reverseArray() {
        final ArrayEx10 arrayEx10 = new ArrayEx10();
        final int[] input = new int[]{1, 2, 3, 4, 5};
        int[] result = new int[]{5, 4, 3, 2, 1};
        assertArrayEquals(result, arrayEx10.reverseArray(input));
    }
}