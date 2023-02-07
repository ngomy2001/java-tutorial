package com.tieumy.exercise;

public class NumeralEx08 {

    public int convertToBinary(final int n){
        String binary = Integer.toBinaryString(n);
        StringBuilder str = new StringBuilder(binary);
        String reverse = str.reverse().toString();
        int result = Integer.parseInt(reverse, 2);
        return result;
    }
}
