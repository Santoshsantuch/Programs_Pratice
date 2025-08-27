package com.learning.patterns;

/// *****
/// ****
/// ***
/// **
/// *
public class Pattern_3 {
    static void pattern(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern(n);

    }
}
