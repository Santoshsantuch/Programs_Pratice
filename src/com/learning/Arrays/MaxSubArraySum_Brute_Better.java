package com.learning.Arrays;

public class MaxSubArraySum_Brute_Better {
    private static int maxSubSumBrute(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    max = Math.max(sum, max);
                    System.out.println(max);
                }
            }
        }
        return max;
    }

    private static int maxSubSumBetter(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                max = Math.max(sum, max);
        }
    }
        return max;
}

public static void main(String[] args) {
    int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
    int res = maxSubSumBetter(arr);
    System.out.println(res);
}
}
