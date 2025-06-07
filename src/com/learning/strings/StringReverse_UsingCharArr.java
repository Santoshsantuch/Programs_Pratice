package com.learning.strings;

import java.util.*;
public class StringReverse_UsingCharArr {
    private static void reverse(String str){
        char[] chars= str.toCharArray();
        int start=0;
        int end=str.length()-1;
        while(start<end){
            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
        System.out.println(new String(chars));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
    }
}
