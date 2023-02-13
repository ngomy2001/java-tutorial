package com.tieumy.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringEx02Test {

    @Test
    void isSymmertrical() {
        final StringEx02 stringEx02 = new StringEx02();
        assertTrue(stringEx02.isSymmertrical("abcdcba"));
        assertTrue(stringEx02.isSymmertrical("abcddcba"));
        assertTrue(stringEx02.isSymmertrical(" "));
        assertFalse(stringEx02.isSymmertrical("abcd"));
    }
}