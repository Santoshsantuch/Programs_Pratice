package com.learning.Arrays;

import java.util.Scanner;

public class MinSubArray_BruteForce {

    public static long findMinSumSubarray(int n, int k, int[] arr) {
        // Write your code here
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n-k;i++){
            int curr_sum=0;
            for(int j=i;j<i+k;j++) {
                curr_sum += arr[j];
            }
            min = Math.min(curr_sum,min);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr={1,2,5,7,1,1,1};
        int k=2;
        int n=arr.length;
        System.out.println(findMinSumSubarray(n, k, arr));
    }
}
