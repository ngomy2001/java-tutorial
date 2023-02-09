package com.tieumy.exercise;

public class StringEx06 {

    public String findVerifyNumber(final String barcode) {
        char[] enteredBarcode = barcode.toCharArray();
        int sumOfOdd = 0;
        int sumOfEven = 0;
        for (int i = 0; i < enteredBarcode.length; i++) {
            if (i % 2 == 0) sumOfEven += Character.getNumericValue(enteredBarcode[i]);
            if (i % 2 != 0) sumOfOdd += Character.getNumericValue(enteredBarcode[i]);
        }
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i <= 9; i++) {
            if ((sumOfOdd + i + 3 * sumOfEven) % 10 == 0) numbers.append(i);
        }
        return numbers.toString();
    }
}
