package com.tieumy.exercise;

public class StringEx02 {

    public String reverseString(final String input) {
        final StringBuilder str = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            str.append(input.charAt(i));
        }
        return str.toString();
    }

    public boolean isSymmertrical(final String input) {

        String reversedString = reverseString(input);
        if (reversedString.equals(input)) return true;
        return false;
    }
}
