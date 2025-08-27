package com.learning.strings;

public class SubsequenceCheck {
    public static boolean isSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == str2.length();
    }

    public static void main(String[] args) {
        String str1 = "santhu";
        String str2 = "stu";

        System.out.println(isSubsequence(str1, str2)); // Output: true
    }
}

