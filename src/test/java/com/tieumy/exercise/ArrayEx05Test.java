package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayEx05Test {

    @Test
    void findGreatest() {
        final ArrayEx05 arrayEx05 = new ArrayEx05();
        assertEquals(3, arrayEx05.findGreatest(new int[]{1, 0, 3}));
        assertEquals(-3, arrayEx05.findGreatest(new int[]{-8, -9, -3}));
        assertEquals(-1, arrayEx05.findGreatest(new int[]{-1, -9, -3}));
        assertEquals(-5, arrayEx05.findGreatest(new int[]{-7, -9, -5}));
        assertEquals(-2, arrayEx05.findGreatest(new int[]{-7, -2, -5}));
        assertEquals(3, arrayEx05.findGreatest(new int[]{1, 0, 3, 2, 1, 0, 1, 2}));
        assertEquals(4, arrayEx05.findGreatest(new int[]{4, 0, 3, 2, 1, 0, 1, 2}));
        assertEquals(6, arrayEx05.findGreatest(new int[]{4, 0, 3, 6, 1, 0, 1, 2}));
    }

    @Test
    void findSmallest() {
        final ArrayEx05 arrayEx05 = new ArrayEx05();
        assertEquals(0, arrayEx05.findSmallest(new int[]{1, 0, 3}));
        assertEquals(-9, arrayEx05.findSmallest(new int[]{-8, -9, -3}));
        assertEquals(-9, arrayEx05.findSmallest(new int[]{-1, -9, -3}));
        assertEquals(-9, arrayEx05.findSmallest(new int[]{-7, -9, -5}));
        assertEquals(-7, arrayEx05.findSmallest(new int[]{-7, -2, -5}));
        assertEquals(0, arrayEx05.findSmallest(new int[]{1, 0, 3, 2, 1, 0, 1, 2}));
        assertEquals(0, arrayEx05.findSmallest(new int[]{4, 0, 3, 2, 1, 0, 1, 2}));
        assertEquals(0, arrayEx05.findSmallest(new int[]{4, 0, 3, 6, 1, 0, 1, 2}));
    }

    @Test
    void subtractOfGreatestAndSmallest() {
        final ArrayEx05 arrayEx05 = new ArrayEx05();
        assertEquals(3, arrayEx05.subtractOfGreatestAndSmallest(new int[]{1, 0, 3}));
        assertEquals(6, arrayEx05.subtractOfGreatestAndSmallest(new int[]{-8, -9, -3}));
        assertEquals(8, arrayEx05.subtractOfGreatestAndSmallest(new int[]{-1, -9, -3}));
        assertEquals(4, arrayEx05.subtractOfGreatestAndSmallest(new int[]{-7, -9, -5}));
        assertEquals(5, arrayEx05.subtractOfGreatestAndSmallest(new int[]{-7, -2, -5}));
        assertEquals(3, arrayEx05.subtractOfGreatestAndSmallest(new int[]{1, 0, 3, 2, 1, 0, 1, 2}));
        assertEquals(4, arrayEx05.subtractOfGreatestAndSmallest(new int[]{4, 0, 3, 2, 1, 0, 1, 2}));
        assertEquals(6, arrayEx05.subtractOfGreatestAndSmallest(new int[]{4, 0, 3, 6, 1, 0, 1, 2}));
    }
}