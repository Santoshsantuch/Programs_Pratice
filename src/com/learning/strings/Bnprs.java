package com.learning.strings;

public class Bnprs {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "xyz";  // index: 0=x, 1=y, 2=z
        StringBuilder sb = new StringBuilder(s1);

        for (int i = 0; i < s1.length(); i++) {
            int asci=s1.charAt(i);
             asci %=s2.length();
            sb.setCharAt(i, s2.charAt(asci));
        }

        System.out.println(sb.toString()); // Output: "xyzxy"
    }
}
