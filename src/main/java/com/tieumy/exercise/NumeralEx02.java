package com.tieumy.exercise;

public class NumeralEx02 {

    public static int calculateSumOfIntegers(final int a) {
        int enteredNumber = a;
        int sum = 0;
        while (enteredNumber > 0) {
            sum += enteredNumber % 10;
            enteredNumber = enteredNumber / 10;
        }
        return sum;
    }
}
