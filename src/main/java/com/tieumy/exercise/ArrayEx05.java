package com.tieumy.exercise;

public class ArrayEx05 {

    public int findGreatest(final int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int findSmallest(final int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int subtractOfGreatestAndSmallest(final int[] arr) {
        int min = findSmallest(arr);
        int max = findGreatest(arr);
        int result = max - min;
        return result;
    }
}
