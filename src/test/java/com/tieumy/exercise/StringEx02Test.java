package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEx02Test {

    @Test
    void reverseString() {
        final StringEx02 stringEx02 = new StringEx02();
        String input = "Independent";
        assertEquals("tnednepednI", stringEx02.reverseString(input));
    }

    @Test
    void isSymmertrical() {
        final StringEx02 stringEx02 = new StringEx02();
        String validInput = "abcdcba";
        String invalidInput = "abcde";
        boolean valueTrue = true;
        boolean valueFalse = false;
        assertEquals(valueTrue, stringEx02.IsSymmertrical(validInput));
        assertEquals(valueFalse, stringEx02.IsSymmertrical(invalidInput));
    }
}