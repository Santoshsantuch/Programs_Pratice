package com.learning.patterns;

/// *********
///  *******
///   *****
///    ***
///     *
public class Pattern_7 {

    static void invertedpyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedpyramid1(int n){
        for (int i = n; i > 0; i--) {
            // Leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        invertedpyramid(n);
    }
}
