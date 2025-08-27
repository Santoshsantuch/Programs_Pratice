package com.learning.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    private static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }

    private static int[] mergeSort(int[] arr, int low, int high) {
        if (low >= high) { return arr;}
            int mid = (low + high)/ 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
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
