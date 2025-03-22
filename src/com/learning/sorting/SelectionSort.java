package com.learning.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    private static int[] selectionSort(int[] arr,int n){

            for(int i=0; i<n-1; i++){
                int min = i;
                for(int j=i; j<n; j++){
                    if(arr[j]<arr[min]){ /// replace "<" with ">" to sort on desc order
                        min= j;
                    }
                    int temp= arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }
            }
            return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] res = selectionSort(arr,n);
        System.out.println(Arrays.toString(res));
    }
}
