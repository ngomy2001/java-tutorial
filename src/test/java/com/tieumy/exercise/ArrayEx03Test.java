package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayEx03Test {

    @Test
    void sortArray() {
        final ArrayEx03 arrayEx03 = new ArrayEx03();
        final int[] input = new int[]{5, 3, 2, 6, 7, 7};
        int[] result = new int[]{2, 3, 5, 6, 7, 7};

        assertArrayEquals(result, arrayEx03.sortArray(input));
    }
}