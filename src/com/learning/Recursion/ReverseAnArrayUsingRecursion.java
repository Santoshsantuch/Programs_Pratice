package com.learning.Recursion;

import java.util.*;

public class ReverseAnArrayUsingRecursion {

    private static void reverse(int[] arr, int i,int n) {
        if (i >= n / 2) return;

        int temp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = temp;

        reverse(arr, i + 1, n);
    }

public static void main(String[] args) {
    int[] arr = {12, 25, 1, 2, 6};
    reverse(arr,0,arr.length);
    System.out.println(Arrays.toString(arr));


}

}
