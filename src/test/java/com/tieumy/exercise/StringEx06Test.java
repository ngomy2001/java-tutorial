package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEx06Test {

    @Test
    void findVerifyNumber() {
        final StringEx06 stringEx06 = new StringEx06();
        assertEquals(4, stringEx06.findVerifyNumber("893850597419"));
        assertEquals(0, stringEx06.findVerifyNumber("293850597419"));
        assertEquals(4, stringEx06.findVerifyNumber("978020137962"));
        assertEquals(5, stringEx06.findVerifyNumber("145234977128"));
    }
}