package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEx06Test {

    @Test
    void findVerifyNumber() {
        final StringEx06 stringEx06 = new StringEx06();
        String input = "893850597419";
        assertEquals("4", stringEx06.findVerifyNumber(input));
    }
}