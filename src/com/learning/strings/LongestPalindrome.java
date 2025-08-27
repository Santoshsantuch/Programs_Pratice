package com.learning.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestPalindrome {
    private static boolean ispalin(String word){
        int start=0;
        int end=word.length()-1;
        while(start<end){
            if(word.charAt(start)!=word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static String longestpalin(String str){
        HashMap<String, Integer> map = new HashMap<>();
        String[] words=str.trim().split(" ");
        for(String word : words){
            if(ispalin(word)){
                map.put(word,word.length());
            }
        }
        int max=0;
        String maxpalinString="";
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max= entry.getValue();
                maxpalinString= entry.getKey();
            }

        }
        return maxpalinString;
    }

    private static boolean palinsentence(String str) {
        String  s=str.toLowerCase().replaceAll("\\s+","");
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
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
        //String res = longestpalin(str);
        boolean res1=palinsentence(str);
        System.out.println(res1);
        //System.out.println(res);
    }
}
