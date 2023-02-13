package com.tieumy.exercise;

public class ArrayEx10 {

    public int[] reverseArray(final int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];
        for (int i = 0, j = length - 1; i < length; i++, j--) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }
}
