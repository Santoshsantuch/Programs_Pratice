package com.learning.Arrays;

import java.util.Arrays;

public class EleMoveToEnd {
    private static int[] random(int[] arr,int ele){
        int n = arr.length;
        for(int i=0;i< n;i++){
            if(arr[i]==ele){
                for(int j = i; j<n-1; j++){
                    arr[j]=arr[j+1];
                }
            }
        }
        arr[n-1]=ele;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,5,4,5,6,8};
        int ele=5;
        int[] res=random(arr,ele);
        System.out.println(Arrays.toString(res));
    }
}
