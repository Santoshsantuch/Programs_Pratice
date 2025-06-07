package com.learning.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {

     private static void bubblesort(int[] arr, int n) {

         for (int i = 0; i < n - 1; i++) {
             boolean swapped = false;
             for (int j = 0; j < n - 1 - i; j++) {
                 if (arr[j] > arr[j + 1]) {
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                     swapped = true;
                 }
             }
             if (!swapped) {
                 System.out.println("array is sorted");
                 break;
             }
         }
     }
//         for(int i=0;i< n-1;i++) {
//             for (int j = 0; j < n - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//
//             }
//         }
//
//         System.out.println(Arrays.toString(arr));


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int n = sc.nextInt();
        int[] arr = new int[n];
        //int[] arr={15,42,16,35,25};
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubblesort(arr,n);

        System.out.println(Arrays.toString(arr));

    }




}


