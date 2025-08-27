package com.learning.Arrays;


import java.util.*;
public class Right_RotateBy_1_Place {
    public static void main(String[] args) {


        // code here
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int temp=arr[n-1];

        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}