package com.learning.Arrays;

import java.util.Arrays;

public class MoveZerosToEnd_Start_Better {

    static int[] movezerosEndBetter(int[] arr){
//        int[] temp=new int[arr.length];
        int j=0;
        for(int num :arr){
            if(num!=0) {
                arr[j++] = num;
            }
        }
        System.out.println(j);
        for(int i=j;i< arr.length;i++){
            arr[i]=0;
        }
        return arr;
    }

    static int[] moveZeros(int[] arr,int n) {
        //  Optimised Code in move Zeros back program lo undi same code with minor changes untayi
        int j = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j--] = arr[i];
            }
        }
        for (int i = j; i >= 0; i--) {
            arr[i] = 0;
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {1,9,0,7,0};
        int n=arr.length;
        int[] res = moveZeros(arr,n);
        System.out.println(Arrays.toString(res));
    }
}

