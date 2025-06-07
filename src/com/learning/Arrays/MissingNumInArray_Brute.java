package com.learning.Arrays;

import java.util.Scanner;

public class MissingNumInArray_Brute {
    private static int missingNum(int[] arr,int n) {

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
