package com.tieumy.exercise;

public class NumeralEx06 {

    public static double calculateSqrt(final double n) {
        double enteredNumber = n;
        if (enteredNumber == 0) return 0;
        double result = 1;
        double accuracy = 0.001;
        do {
            result = enteredNumber / (2 * result) + result / 2;
        } while (Math.abs(result * result - enteredNumber) > accuracy);
        return result;
    }
}
