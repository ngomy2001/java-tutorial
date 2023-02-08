package com.tieumy.exercise;

public class ArrayEx08 {

    public int sumOfSquares(final int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i] * arr[i];
        return sum;
    }
}
