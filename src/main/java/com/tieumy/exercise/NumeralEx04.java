package com.tieumy.exercise;

public class NumeralEx04 {

    public static int sumOfFibonaci(final int n) {
        int enteredNumber = n;
        if (enteredNumber <= 0) {
            return -1;
        }

        if (enteredNumber == 1) {
            return 1;
        }
        int f0 = 1;
        int f1 = 1;
        int fn = 0;
        int sum = 2;
        while (fn < enteredNumber) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            sum += fn;
        }
        return sum;
    }
}
