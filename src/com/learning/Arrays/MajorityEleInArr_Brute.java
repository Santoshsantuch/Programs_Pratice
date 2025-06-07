package com.learning.Arrays;

import java.util.Scanner;

public class MajorityEleInArr_Brute {

    private static int majority_ele(int[] arr, int half_length) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > half_length) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={5,5,5,8,8};
        int half_length=arr.length/2;
        int res=majority_ele(arr, half_length);
        System.out.println(res);

    }
}
