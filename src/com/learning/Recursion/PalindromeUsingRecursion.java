package com.learning.Recursion;

public class PalindromeUsingRecursion {
    private static boolean palin(String str,int i,int n){
        if(i>=n/2) return true;
        if(str.charAt(i)!=str.charAt(n-1-i)){
            return false;
        }
       return  palin(str,i+1,n);
    }
    public static void main(String[] args) {
        String str="madams";
       boolean res= palin(str,0,str.length());
        System.out.println(res);
    }
}
