package com.learning.numbers;

import java.util.Scanner;

public class BinaryToDec_Palin {
    private static boolean isBin_pal(int n1,int n2){
        String str1= decToBin(n1);
        String str2= decToBin(n2);

        if(palin(str1)==palin(str2)){
            return true;
        }
        return false;
    }
    private static String decToBin(int n){
        int count=0,dec_num=0;
        while(n!=0){
            int rem=n%2;
            double c=Math.pow(10,count);
            n=n/2;
            dec_num+=rem*c;
            count++;
        }
        return Integer.toString(dec_num);
    }
    private static boolean palin(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        boolean res=isBin_pal(s1,s2);
        System.out.println(res);
    }
}
