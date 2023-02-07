package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayEx01Test {

    @Test
    void findGreatest() {
        final ArrayEx01 arrayEx01 = new ArrayEx01();
        assertEquals(3, arrayEx01.findGreatest(new int[]{1, 0, 3}));
        assertEquals(3, arrayEx01.findGreatest(new int[]{1, 0, 3, 2, 1, 0, 1, 2}));
        assertEquals(4, arrayEx01.findGreatest(new int[]{4, 0, 3, 2, 1, 0, 1, 2}));
        assertEquals(6, arrayEx01.findGreatest(new int[]{4, 0, 3, 6, 1, 0, 1, 2}));
    }
}