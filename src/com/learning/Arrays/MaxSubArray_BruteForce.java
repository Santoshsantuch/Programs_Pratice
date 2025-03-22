package com.learning.Arrays;

// T.C= O(n^2);
// S.C= O(1);
public class MaxSubArray_BruteForce {
    public static void main(String[] args) {
        int[] arr={7,9,1,7,8};
        int k=2;
        int res=max_sum_sub(arr,k,arr.length);
        System.out.println(res);
    }
    static int max_sum_sub(int[] a,int k,int n){

        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-k;i++){
            int curr_sum=0;
            for(int j=i;j<i+k;j++){
                curr_sum+=a[j];
            }
            max=Math.max(curr_sum,max);
        }
        return max;
    }
}
