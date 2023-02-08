package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEx01Test {

    @Test
    void reverseString() {
        final StringEx01 stringEx01 = new StringEx01();
        String input = "Independent";
        assertEquals("tnednepednI", stringEx01.reverseString(input));
    }
}