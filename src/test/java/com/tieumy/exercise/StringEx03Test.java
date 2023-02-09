package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEx03Test {

    @Test
    void sumOfIntegersInString() {
        final StringEx03 stringEx03 = new StringEx03();
        String input = "abc 123 def 33 mn 3.221";
        assertEquals(380, stringEx03.sumOfIntegersInString(input));
    }
}