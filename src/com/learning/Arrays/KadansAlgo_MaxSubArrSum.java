package com.learning.Arrays;

public class KadansAlgo_MaxSubArrSum {
    private static int kadansAlogo(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0, ansStart = -1, ansEnd = -1, start = -1;
        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i;
            }
            sum+=arr[i];
            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int res = kadansAlogo(arr);
        System.out.println(res);
    }
}
