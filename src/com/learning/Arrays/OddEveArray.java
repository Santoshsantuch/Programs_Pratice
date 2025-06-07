package com.learning.Arrays;

import java.util.Arrays;

public class OddEveArray {
    private static int[] oddeve(int[] arr){
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;

        for(int i=3;i< arr.length;i++){
            if(i%2==1){
                arr[i]=arr[i-1]+arr[i-2];
            }else{
                arr[i]=arr[i-1]+arr[i-3];

            }
        }
        return arr;


    }

    public static void main(String[] args) {
        int[] arr=new int[7];
        int[] res=oddeve(arr);
        System.out.println(Arrays.toString(res));
    }
}
