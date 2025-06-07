package com.learning.Arrays;

import java.util.Scanner;

public class MissingNumInArray_Better {

    private static int missingNum(int[] arr,int n){

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1 - 1; i++) {
            arr1[i] = sc.nextInt();
        }
        int resNum = missingNum(arr1,n1);
        System.out.println(resNum);
    }
}
