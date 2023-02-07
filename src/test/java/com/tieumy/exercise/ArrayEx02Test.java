package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ArrayEx02Test {

    @Test
    void findSumOfArray() {
        final ArrayEx02 arrayEx02 = new ArrayEx02();
        assertEquals(2, arrayEx02.findSumOfArray(new int[]{1, 2, 3, 4}));
    }
}