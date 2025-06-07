package com.learning.Arrays;

import java.util.Arrays;

public class MoveZerosToEnd_Start_Opt {
    static int[] moveZeros(int[] arr,int n){
        /// Move Zeros To Start OPT
//        int index = n-1;
//        for(int i = n-1; i>=0; i--) {
//            if (arr[i] != 0) {
//                int temp = arr[i];
//                arr[i] = arr[index];
//                arr[index] = temp;
//                index--;
//            }
//        }
        int index =0;
        for(int i = 0; i<n; i++) {
            if (arr[i] != 0) { /// it works any number not only zero {BNPRS}
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        if(index== arr.length) System.out.println("No Zeros in this array");
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,9,3,7,3,1,2};
        int n=arr.length;
        int[] res = moveZeros(arr,n);
        System.out.println(Arrays.toString(res));
    }
}
//for(int i=0;i< arr.length;i++){
//        if(i!=0) {
//              arr[nonZeroIndex--] = i;
//            };
//            }
//   for(int i=nonZeroIndex;i>=0;i--){
//            arr[i]=0;
//        }