package com.tieumy.exercise;

public class StringEx03 {

    public int sumOfIntegersInString(final String input) {
        int sum = 0;
        int x = 0;
        for (int i = 0; i < input.length(); i++) {
            final char c = input.charAt(i);
            if (Character.isDigit(c)) {
                x = x * 10 + (c - '0');
            } else {
                sum += x;
                x = 0;
            }
        }
        return sum + x;
    }
}
