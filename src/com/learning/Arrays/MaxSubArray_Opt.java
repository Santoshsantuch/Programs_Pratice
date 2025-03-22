package com.learning.Arrays;

/// /Sliding window Algorithm
public class MaxSubArray_Opt {

    static int max_sum_sub(int[] arr,int k,int n){
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
        int[] arr={7,9,1,7,8};
        int k=2;
        int res=max_sum_sub(arr,k,arr.length);
        System.out.println(res);
    }
}
