package com.tieumy.exercise;

public class StringEx06 {

    public int findVerifyNumber(final String barcode) {
        int sum = 0;
        for (int i = 0; i < barcode.length(); i++) {
            if (i % 2 == 0) {
                sum += barcode.charAt(i) - '0';
            } else {
                sum += 3 * (barcode.charAt(i) - '0');
            }
        }
        return (10 - (sum % 10)) % 10;
    }
}
