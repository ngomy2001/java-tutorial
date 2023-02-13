package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEx03Test {

    @Test
    void sumOfIntegersInString() {
        final StringEx03 stringEx03 = new StringEx03();
        String input = "abc 123 def 33 mn 3.221";
        String input2 = "abc 12 def 33 mn 5,1";
        String input3 = "My  12  cow  2, ab21";
        assertEquals(380, stringEx03.sumOfIntegersInString(input));
        assertEquals(51, stringEx03.sumOfIntegersInString(input2));
        assertEquals(35, stringEx03.sumOfIntegersInString(input3));
    }
}