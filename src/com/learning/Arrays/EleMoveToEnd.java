package com.learning.Arrays;

import java.util.Arrays;

public class EleMoveToEnd {
    private static int[] random(int[] arr,int ele){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==ele){
                int temp=i;
                for(int j=temp;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
            }
        }
        arr[arr.length-1]=ele;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,5,4,5,6,8};
        int ele=5;
        int[] res=random(arr,ele);
        System.out.println(Arrays.toString(res));
    }
}
