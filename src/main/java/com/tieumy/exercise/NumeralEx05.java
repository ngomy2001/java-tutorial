package com.tieumy.exercise;

public class NumeralEx05 {

    public static int sumOfEquidistantNumbers(int n) {
        int enteredNumber = n;
        int sum = 0;
        if (enteredNumber == 0) return -1;
        for (int i = 1; i <= enteredNumber; i++) {
            sum += i * (i + 1);
        }
        return sum;
    }
}
