package com.learning.Arrays;

public class RemoveDuplicatesInArray_ReturnLength {

    private static int removedup(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,5,4,4,3};
        int len=removedup(arr);
        System.out.println(len);
    }
}
