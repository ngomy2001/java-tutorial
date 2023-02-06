package com.tieumy.exercise;

public class NumeralEx05 {

    public static int sumOfEquidistantNumbers(int n) {
        int enteredNumber = n;
        if (enteredNumber == 0) return -1;
        int sum = (enteredNumber * (enteredNumber + 1) * (enteredNumber + 2)) / 3;
        return sum;
    }
}
