package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumeralEx03Test {

    @Test
    void factorizeNumber() {
        final var factorizedNumber = new NumeralEx03();
        assertEquals("2 * 2 * 2 * 3 * 5 * 5", factorizedNumber.factorizeNumber(600));
    }
}