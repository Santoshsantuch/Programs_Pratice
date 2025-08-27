package com.learning.Arrays;

import java.util.Scanner;

public class MinSubArray {

    private static long findMinSumSubarray(int n, int k, int[] arr) {
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
    private static long min_sum_sub(int[] arr,int k,int n){
        int curr_sum=0;
        long min =Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            curr_sum+=arr[i];
        }
        min =curr_sum;
        for(int i=k;i<n;i++){
            curr_sum+=arr[i]-arr[i-k];
            min =Math.min(curr_sum, min);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr={9,2,5,7,1,2,5};
        int k=2;
        int n=arr.length;
        System.out.println(findMinSumSubarray(n, k, arr));
    }
}
