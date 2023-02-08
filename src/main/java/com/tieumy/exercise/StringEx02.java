package com.tieumy.exercise;

public class StringEx02 {

    public String reverseString(final String input) {
        char[] enteredString = input.toCharArray();
        char[] result = new char[enteredString.length];
        int j = enteredString.length;
        for (int i = 0; i < enteredString.length; i++) {
            result[j - 1] = enteredString[i];
            j--;
        }
        return String.valueOf(result);
    }

    public boolean IsSymmertrical(final String input) {

        String reversedString = reverseString(input);
        if (reversedString.equals(input)) return true;
        return false;
    }
}
