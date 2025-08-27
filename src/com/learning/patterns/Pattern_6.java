package com.learning.patterns;

///      *
///     ***
///    *****
///   *******
///  *********
/// ***********
///  *********
///   *******
///    *****
///     ***
///      *
public class Pattern_6 {

    static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

        static void hallowdiamond(int n){
            for (int i = 1; i <= n; i++) {
                // Leading spaces
                for (int j = 1; j <= n - i+1; j++) {
                    System.out.print("*");
                }
                // Printing stars
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                /// optional only for testing another pattern
                for (int j = 1; j <= n - i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // Lower part of the diamond
            for (int i = n - 1; i > 0; i--) {
                // Leading spaces
                for (int j = 1; j <= n - i +1; j++) {
                    System.out.print("*");
                }
                // Printing stars
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                /// optional only for testing another pattern
                for (int j = 1; j <= n - i +1 ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        int n = 5;
        diamond(n);
        hallowdiamond(n);
    }
}
