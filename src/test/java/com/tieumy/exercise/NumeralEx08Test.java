package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeralEx08Test {

    @Test
    void convertToBinary() {
        final NumeralEx08 numeralEx08 = new NumeralEx08();
        assertEquals(29, numeralEx08.convertToBinary(23));
    }
}