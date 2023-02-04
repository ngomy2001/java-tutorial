package com.tieumy.exercise;

public class NumeralEx03 {

    public static String factorizeNumber(final int n) {
        int enteredNumber = n;
        String result = "";
        for (int i = 2; i <= enteredNumber; i++) {
            while (enteredNumber % i == 0) {
                enteredNumber = enteredNumber / i;
                if (enteredNumber == 1)
                    result = result + (i + "");
                else
                    result = result + (i + " * ");
            }
            if (enteredNumber == 1)
                break;
        }
        return result;
    }
}
