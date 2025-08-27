package com.learning.Arrays;

import java.util.Arrays;

public class MergedTwoSorted_Array {
    private static int[] merge(int[]arr1,int[] arr2){
        int len=arr1.length+ arr2.length;
        int[] res=  new int[len];
        int i=0,j=0,k=0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }
        // Add remaining elements of arr1 (if any)
        while (i < arr1.length) {
            res[k++] = arr1[i++];
        }
        // Add remaining elements of arr2 (if any)
        while (j < arr2.length) {
            res[k++] = arr2[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        int[] res = merge(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}
