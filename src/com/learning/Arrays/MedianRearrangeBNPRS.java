package com.learning.Arrays;

public class MedianRearrangeBNPRS {

    // Custom sort function (Selection Sort)
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Custom reverse function
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rearrange(int[] arr) {
        int n = arr.length;

        // 1. Sort the array
        sort(arr);

        // 2. Find median
        int medianIndex = n / 2;
//        int medianIndex = (n % 2 == 0) ? (n / 2 - 1) : (n / 2);
        int median = arr[medianIndex];

        // 3. Separate into left and right arrays
        int[] left = new int[n];
        int[] right = new int[n];
        int l = 0, r = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= median) {
                left[l++] = arr[i];
            } else {
                right[r++] = arr[i];
            }
        }

        // 4. Reverse the left part
        reverse(left, 0, l - 1);

        // 5. Combine left + right into original array
        int index = 0;
        for (int i = 0; i < l; i++) {
            arr[index++] = left[i];
        }
        for (int i = 0; i < r; i++) {
            arr[index++] = right[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 5, 7};

        rearrange(arr);

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Expected: 5 2 1 6 9
    }
}

