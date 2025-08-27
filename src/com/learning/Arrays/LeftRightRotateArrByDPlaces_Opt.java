package com.learning.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeftRightRotateArrByDPlaces_Opt {

    private static int[] leftRotateBy_D_PlacesBruteForce(int[] arr,int n,int d) {
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < d; i++) {
            temp.add(arr[i]);
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = n - d; i < n; i++) {
            arr[i] = temp.get(i - (n - d));
        }
        return arr;
    }

    private static int[] leftRotateBy_D_PlacesOpt(int[] arr,int n,int d) {
            reverse(arr,0,d-1);
           reverse(arr, d,n-1);
            reverse(arr,0,n-1);
            return arr;
    }

    private static int[] rightRotateBy_D_PlacesOpt(int[] arr,int n,int d) {
        reverse(arr,0,n-d-1);
        reverse(arr, n-d,n-1);
        reverse(arr,0,n-1);
        return arr;
    }

    private static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
       int[] res = rightRotateBy_D_PlacesOpt(arr, n, d);
       System.out.println(Arrays.toString(res));


    }
}
