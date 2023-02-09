package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEx04Test {

    @Test
    void isValidBarcode() {
        final StringEx04 stringEx04 = new StringEx04();
        String input = "8938505974194";
        String invalidInput = "8938505974193";
        boolean valueTrue = true;
        boolean valueFalse = false;
        assertEquals(valueTrue, stringEx04.isValidBarcode(input));
        assertEquals(valueFalse, stringEx04.isValidBarcode(invalidInput));
    }
}