package com.learning.Arrays;

import java.util.Arrays;

public class MoveZerosToEnd_Better {
    static int[] move_zeros(int[] arr){
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

    public static void main(String[] args) {
        int[] arr={0,9,0,7,8};
        int[] res=move_zeros(arr);
        System.out.println(Arrays.toString(res));
    }
}
