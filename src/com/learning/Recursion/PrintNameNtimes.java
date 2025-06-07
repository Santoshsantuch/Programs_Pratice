package com.learning.Recursion;

import java.util.Scanner;
/// T.C =O(N)
/// S>C = O(N)
public class PrintNameNtimes {

    private  static void printName(int i,int n){
        if(i>n){
            return;
        }
        ///System.out.println("Santhu");
        System.out.println(n);
        printName(i,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printName(1,n);
    }
}
