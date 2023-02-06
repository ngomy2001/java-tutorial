package com.tieumy.exercise;

public class NumeralEx05 {

    public int sumOfEquidistantNumbers(final int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (i + 1);
        }
        return sum;
    }
}
