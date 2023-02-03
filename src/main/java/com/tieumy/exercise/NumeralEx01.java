package com.tieumy.exercise;

public class NumeralEx01 {

    public static int findGCD(final int a, final int b) {
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 & b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int findLCM(final int a, final int b) {
        return a * b / findGCD(a, b);
    }
}
