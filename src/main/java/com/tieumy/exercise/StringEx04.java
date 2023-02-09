package com.tieumy.exercise;

public class StringEx04 {

    public boolean isValidBarcode(final String barcode) {
        char[] enteredBarcode = barcode.toCharArray();
        int sumOfOdd = 0;
        int sumOfEven = 0;
        for (int i = 0; i < enteredBarcode.length; i++) {
            if (i % 2 == 0) sumOfEven += enteredBarcode[i];
            if (i % 2 != 0) sumOfOdd += enteredBarcode[i];
        }

        if ((sumOfEven + 3 * sumOfOdd) % 10 == 0) return true;
        else return false;
    }
}
