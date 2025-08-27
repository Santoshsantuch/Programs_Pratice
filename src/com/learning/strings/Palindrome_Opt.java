package com.learning.strings;

import java.util.Scanner;

public class Palindrome_Opt {
    private static boolean isPalin(String str) {
//        char[] chars=str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean res = isPalin(str);
        if (res) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
