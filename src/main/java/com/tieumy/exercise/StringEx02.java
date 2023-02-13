package com.tieumy.exercise;

public class StringEx02 {

    public boolean isSymmertrical(final String input) {
        int first = 0;
        int last = input.length() - 1;
        while (first <= last) {
            if (input.charAt(first) != input.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
