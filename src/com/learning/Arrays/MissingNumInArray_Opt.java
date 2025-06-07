package com.learning.Arrays;

import java.util.Scanner;

public class MissingNumInArray_Opt {

    private static int missingNum(int[] arr,int n) {

        int sum=n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum2+=arr[i];
        }
        return sum-sum2;
    }
    private static int missingNumUsingXOR(int[] arr,int n){
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
        int resNum = missingNumUsingXOR(arr1,n1);
        System.out.println(resNum);
    }
}
