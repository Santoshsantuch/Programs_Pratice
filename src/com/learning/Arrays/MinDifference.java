package com.learning.Arrays;

import java.util.Arrays;

public class MinDifference {

    private static int difference(int[] arr1,int[] arr2){
       int min=Integer.MAX_VALUE;
       for(int i : arr1){
           for(int j :arr2){
               int diff=Math.abs(i-j);
               min=Math.min(diff,min);

           }
       }
        return min;
    }

    private static int differenceOpt(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        int min = Integer.MAX_VALUE;

        while (i < arr1.length && j < arr2.length) {
            int diff = Math.abs(arr1[i] - arr2[j]);
            min = Math.min(min, diff);
            // Move the pointer that points to the smaller element
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr1={14,16,2,5,80,10};
        int[] arr2={27,11,30,45,96};
        int res=differenceOpt(arr1,arr2);
        System.out.println(res);
    }
}
