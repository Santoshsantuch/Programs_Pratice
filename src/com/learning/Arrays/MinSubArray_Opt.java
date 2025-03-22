package com.learning.Arrays;

public class MinSubArray_Opt {

    static int min_sum_sub(int[] arr,int k,int n){
        int curr_sum=0;
        int min =Integer.MIN_VALUE;
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
        int[] arr={7,9,1,7,8};
        int k=2;
        int res=min_sum_sub(arr,k,arr.length);
        System.out.println(res);
    }
}
