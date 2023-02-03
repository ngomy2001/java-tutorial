package com.tieumy.exercise;

public class NumeralEx01 {

    public static int findGCD(final int a, final int b) {
        int enteredNumber1 = a;
        int enteredNumber2 = b;
        while (enteredNumber1 != enteredNumber2) {
            if (enteredNumber1 > enteredNumber2) {
                enteredNumber1 = enteredNumber1 - enteredNumber2;
            } else {
                enteredNumber2 = enteredNumber2 - enteredNumber1;
            }
        }
        return enteredNumber1;
    }

    public static int findLCM(final int a, final int b) {
        return a * b / findGCD(a, b);
    }
}
