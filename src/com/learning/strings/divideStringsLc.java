package com.learning.strings;

import java.util.Arrays;

public class divideStringsLc {

    private static String[] divideString(String s, int k, char fill) {

        /// int arraySize = (s.length() + k - 1) / k;
        /// Resource - https://chatgpt.com/c/68576627-a330-8006-ac74-8ade09c78366
        int arraySize = (int) Math.ceil((double) s.length() / k);
        String[] words = new String[arraySize];
        int index=0;
        for(int i=0;i<s.length();i+=k){
            int end=Math.min(i+k,s.length());
            StringBuilder part=new StringBuilder(s.substring(i,end));
            while(part.length()<k){
                part.append(fill);
            }
            words[index++]=part.toString();
        }

        return words;
    }

    public static void main(String[] args) {
        String str="sansursaima";
        int k=6;
        char ch='x';
        String[] res=divideString(str,k,ch);
        System.out.println(Arrays.toString(res));
    }
}
