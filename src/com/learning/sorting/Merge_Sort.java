package com.learning.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort {

    private static void merge(int[] arr, int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }

    }

    public static int[] mergeSort(int[] arr, int low, int high) {
        if (low >= high) {return arr;}
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
         int[] res=mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(res));
    }
}
