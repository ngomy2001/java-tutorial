package com.tieumy.exercise;

public class NumeralEx06 {

    private static double ACCURACY = 0.001;

    public double calculateSqrt(final double n) {
        double result = n;
        double before;

        do {
            before = result;
            result = n / (2 * result) + result / 2;
        } while (Math.abs(before - result) > ACCURACY);
        return result;
    }
}
