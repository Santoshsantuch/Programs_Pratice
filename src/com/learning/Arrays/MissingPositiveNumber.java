package com.learning.Arrays;

//Requirements:
//Input: An unsorted array of integers (can be positive, negative, zero).
//
//Output: The smallest positive integer missing from the array.
//
//Time complexity: O(n)
//
//Space complexity: O(1) (constant extra space, modify input array if needed)
//
//Example:
//Input: [3, 4, -1, 1]
//Output: 2

import java.util.Scanner;

public class MissingPositiveNumber {

    private static int missPos(int[] arr) {
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            } else if (arr[i] > large) {
                large = arr[i];
            }
        }

        for (int j = small; j <= large; j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (j == arr[i] || j==0) {
                    count = 1;
                }

            }
            if (count == 0) {
                return j;
            }
        }


        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int res = missPos(arr);
        System.out.println(res);
    }
}
