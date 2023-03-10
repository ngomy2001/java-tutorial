package com.tieumy.exercise;

public class StringEx04 {

    public boolean isValidBarcode(final String barcode) {
        int sum = 0;
        for (int i = 0; i < barcode.length(); i++) {
            if (i % 2 == 0) {
                sum += barcode.charAt(i) - 0;
            }
            else {
                sum += 3 * (barcode.charAt(i) - 0);
            }
        }
        return sum % 10 == 0;
    }
}
