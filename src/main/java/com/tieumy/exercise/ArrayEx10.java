package com.tieumy.exercise;

public class ArrayEx10 {

    public int[] reverseArray(final int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];
        int j = length;
        for (int i = 0; i < length; i++) {
            reversedArray[j - 1] = arr[i];
            j--;
        }
        return reversedArray;
    }
}
