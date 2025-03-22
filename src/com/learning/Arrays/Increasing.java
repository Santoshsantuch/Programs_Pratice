package com.learning.Arrays;

public class Increasing {
    private static String inc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                return "Increasing";
            } else if (arr[i - 1] > arr[i]) {
                return "decreasing";
            }
        }
        return "no order";
    }
        public static void main(String[] args)
        {
            int[] arr = {5, 2, 8, 4, 2};
            String s = inc(arr);
            System.out.println(s);
        }
}
