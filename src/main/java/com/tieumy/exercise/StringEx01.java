package com.tieumy.exercise;

public class StringEx01 {
    public String reverseString(final String input) {
        final StringBuilder str = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            str.append(input.charAt(i));
        }
        return str.toString();
    }
}
