package com.learning.strings;

import java.util.Scanner;

public class Palindrome {
    private static boolean isPalin(String str){

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev.equals(str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean res=isPalin(str);
        if(res){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
