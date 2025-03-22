package com.learning.Arrays;

import java.util.Arrays;

public class Palindrome_Array {

    public static boolean isPalindrome(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    int[] arr={1,2,5,8,2};
    int n= arr.length;
        if (isPalindrome(arr)) {
            System.out.println("Palindrome Array");
        } else {
            System.out.println("Not a Palindrome Array");
        }
    }

}
