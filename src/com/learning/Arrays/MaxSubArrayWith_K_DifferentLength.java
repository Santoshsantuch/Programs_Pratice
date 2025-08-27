package com.learning.Arrays;

// T.C= O(n^2);
// S.C= O(1);
public class MaxSubArrayWith_K_DifferentLength {
    private static int max_sum_sub(int[] a, int k, int n) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - k; i++) {
            int curr_sum = 0;
            for (int j = i; j < i + k; j++) {
                curr_sum += a[j];
            }
            max = Math.max(curr_sum, max);
        }
        return max;
    }

    private static int SlidingWindowAlgorithmOpt(int[] arr,int k,int n){
        int curr_sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            curr_sum+=arr[i];
        }
        max=curr_sum;
        for(int i=k;i<n;i++){
            curr_sum+=arr[i]-arr[i-k];
            max=Math.max(curr_sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7, 9, 1, 7, 8};
        int k = 2;
        int res = SlidingWindowAlgorithmOpt(arr, k, arr.length);
        System.out.println(res);
    }

}
