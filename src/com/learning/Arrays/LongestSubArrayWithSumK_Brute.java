package com.learning.Arrays;

public class LongestSubArrayWithSumK_Brute {
    private static int longestSubArr(int[] arr,int K,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                count+=arr[j];
                if(count==K){
                     /// Here j+1 we need why because the index start from 0
                    ///y.k.t we need -i to get the starting index of i were its started
                    max=Math.max(max,j-i+1);
                }
            }
        }
    return max;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        int k=4;
        int res=longestSubArr(arr,k,arr.length);
        System.out.println(res);
    }
}
