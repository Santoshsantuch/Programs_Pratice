package com.learning.Recursion;

import java.util.Scanner;

public class PrintUsingBackTracking {

    private static  void funcBacktracking(int i,int n){
        /// if(i<1)
        if(i>n){
            return ;
        }
        funcBacktracking(i+1,n);
        ///         funcBacktracking(i-1,n);
        System.out.println(i);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        funcBacktracking(1,n);
        ///funcBacktracking(n,n);
    }
}
