package com.learning.Arrays;

import java.util.*;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        //int[] arr={1,2,3,4,5};
        int start=0;
        int end=arr1.length-1;
         while(start<end){
             int temp=arr1[start];
             arr1[start]=arr1[end];
             arr1[end]=temp;
             start++;
             end--;
         }
         for(int i=0;i<arr1.length;i++){
             System.out.print(arr1[i]+" ");
         }
         //System.out.println(Arrays.toString(arr1));

    }
}
