package com.learning.Arrays;

public class MinDifference {

    private static int difference(int[] arr1,int[] arr2){
       int min=Integer.MAX_VALUE;
       for(int i : arr1){
           for(int j :arr2){
               int diff=Math.abs(i-j);
               min=Math.min(diff,min);

           }
       }

        return min;

    }



    public static void main(String[] args) {
        int[] arr1={14,16,2,5,80};
        int[] arr2={27,11,30,45,96};
        int res=difference(arr1,arr2);
        System.out.println(res);
    }
}
