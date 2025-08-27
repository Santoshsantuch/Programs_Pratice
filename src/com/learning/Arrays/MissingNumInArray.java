package com.learning.Arrays;

import java.util.Scanner;

public class MissingNumInArray {

    private static int missingNumBrute(int[] arr,int n) {

        for(int i=1;i<=n;i++){
            int flag=0;
            for(int j=0;j<=n-1;j++){
               if(i==arr[j]){
                 flag=1;
                 break;
             }
            }
            if(flag==0) return i;
        }
        return -1;
    }

    private static int missingNumBetter(int[] arr,int n){

        int[] hashArr = new int[n+1];
        for(int i=0;i<n-1;i++){
            hashArr[arr[i]]=1;
        }
        for(int i=1;i<n;i++){
            if(hashArr[i]==0){
                return i;
            }
        }
        return -1;
    }

    private static int missingNumOpt1(int[] arr,int n) {

        int sum=n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum2+=arr[i];
        }
        return sum-sum2;
    }

    private static int missingNumUsingXOROpt2(int[] arr,int n){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^n;
        return xor1^xor2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1 - 1; i++) {
            arr1[i] = sc.nextInt();
        }
        int resNum = missingNumBrute(arr1,n1);
        System.out.println(resNum);
    }
}
