package com.tieumy.exercise;

public class ArrayEx01 {

    public int findGreatest(final int[] arr){
        int result = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i+1]) {
                result = arr[i+1];
            }else{
                result = arr[i];
            }
        }
        return result;
    }
}
