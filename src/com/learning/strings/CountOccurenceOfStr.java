package com.learning.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountOccurenceOfStr {
    private static void countChar(String str){
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char c: str.toCharArray()){
            map.put(c , map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            System.out.print(c+" "+map.get(c)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        countChar(str);
    }
}
