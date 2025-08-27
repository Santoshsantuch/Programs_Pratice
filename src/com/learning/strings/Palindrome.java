package com.learning.strings;

import java.util.Scanner;

public class Palindrome {
    private static boolean isPalin(String str){

        StringBuilder rev= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            ///  this is mot a good one santhu why because every time while concatenating
            ///  it will create another string dude
            //rev+=str.charAt(i);
            rev.append(str.charAt(i));
        }
        return rev.toString().equals(str);
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
