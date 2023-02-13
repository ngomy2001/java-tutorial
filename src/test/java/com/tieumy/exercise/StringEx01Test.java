package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEx01Test {

    @Test
    void reverseString() {
        final StringEx01 stringEx01 = new StringEx01();
        String input = "Independent";
        String input2 = "My";
        assertEquals("tnednepednI", stringEx01.reverseString(input));
        assertEquals("yM", stringEx01.reverseString(input2));
    }
}