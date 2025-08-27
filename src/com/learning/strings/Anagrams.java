package com.learning.strings;

import java.util.Scanner;

public class Anagrams {
    private static boolean isAnagrams(String s1,String s2){
        if(s1.length() != s2.length()) { return false; }

        int[] charCount = new int[26];
        for(int i=0; i<s1.length();i++){
            charCount[s1.charAt(i)-'a']++;
            charCount[s2.charAt(i)-'a']--;
        }
        for(int count : charCount){
            if(count!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean res = isAnagrams(str1,str2);
        System.out.println(res);


    }
}
