package com.learning.Arrays;

public class IncDecNoOrder {
    private static String inc(int[] arr) {
        boolean Increasing=true;
        boolean Decreasing=true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                Decreasing=false;

            } else if (arr[i - 1] > arr[i]) {
                Increasing=false;
            }
        }
        if(Increasing){
            return "increasing";
        }else if(Decreasing) {
            return "Decreasing";
        }
        return "No order";
    }
        public static void main(String[] args)
        {
            int[] arr = {1,2,3,4,5};
            String s = inc(arr);
            System.out.println(s);
        }
}
