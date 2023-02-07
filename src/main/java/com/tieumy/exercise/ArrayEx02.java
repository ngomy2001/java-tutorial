package com.tieumy.exercise;

public class ArrayEx02 {

    public int findSumOfArray(final int[] arr) {
        int sumOfOdd = 0;
        int sumOfEven = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                sumOfEven += j;
            } else sumOfOdd += j;
        }
        return sumOfEven - sumOfOdd;
    }
}
