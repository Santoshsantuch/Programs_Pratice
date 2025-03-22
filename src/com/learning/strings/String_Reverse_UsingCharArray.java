package com.learning.strings;

import java.util.Scanner;



public class String_Reverse_UsingCharArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(); //object
        char[] chars=str.toCharArray();
//        StringBuffer sb=new StringBuffer(str);
//        System.out.println(sb.reverse());
        StringBuilder sbr=new StringBuilder(str);
        System.out.println(sbr.reverse());
//        for(int i=str.length()-1;i>=0;i--){
//            System.out.print(chars[i]+" ");
//
//        }

    }
}
