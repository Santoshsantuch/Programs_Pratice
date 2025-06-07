package com.learning.Arrays;

public class NumApperasOnce_Brute {

    private static int numApperasOnce(int[] arr){
        int n= arr.length;

        for(int i=0;i<n;i++){
            int num=arr[i];
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[j]==num){
                    cnt++;
                }
            }
            if(cnt==1) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        int var = numApperasOnce(arr);
        System.out.println(var);
    }
}
