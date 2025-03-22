package com.learning.Arrays;

import java.util.Arrays;

public class LeftRotate_Array_By_1_Place {
    public static void main(String[] args) {
        int[] arr={2,25,7,8,8};
        int[] res=left_rotate(arr,arr.length);
        System.out.println(Arrays.toString(res));
    }
    static int[] left_rotate(int[] arr,int n){
        int first=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=first;
        return arr;
    }
}
