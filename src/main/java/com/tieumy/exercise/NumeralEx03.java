package com.tieumy.exercise;

public class NumeralEx03 {

    public String factorizeNumber(final int n) {
        int enteredNumber = n;
        StringBuffer sb = new StringBuffer();
        for (int i = 2; i <= enteredNumber; i++) {
            while (enteredNumber % i == 0) {
                enteredNumber /= i;
                sb.append(i);
                if (enteredNumber > 1) {
                    sb.append(" * ");
                }

            }
        }
        return sb.toString();
    }
}
