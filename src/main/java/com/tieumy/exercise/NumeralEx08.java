package com.tieumy.exercise;

public class NumeralEx08 {

    public int convertToBinary(final int n) {
        int enteredNumber = n;
        int foundNumber = 0;
        while (enteredNumber > 0) {
            foundNumber = 2 * foundNumber + enteredNumber % 2;
            enteredNumber = enteredNumber / 2;
        }
        return foundNumber;
    }
}
