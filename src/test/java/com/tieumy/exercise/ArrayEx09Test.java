package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayEx09Test {

    @Test
    void isPrime() {
        final ArrayEx09 arrayEx09 = new ArrayEx09();
        boolean resultTrue = true;
        boolean resultFalse = false;
        assertEquals(resultTrue, arrayEx09.isPrime(2));
        assertEquals(resultFalse, arrayEx09.isPrime(1));
        assertEquals(resultTrue, arrayEx09.isPrime(17));
    }

    @Test
    void countPrimes() {
        final ArrayEx09 arrayEx09 = new ArrayEx09();
        assertEquals(4, arrayEx09.countPrimes(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }
}