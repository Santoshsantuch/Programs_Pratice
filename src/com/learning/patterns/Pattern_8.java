package com.learning.patterns;

/// *
/// **
/// ***
/// ****
/// *****
/// ****
/// ***
/// **
/// *
public class Pattern_8 {

    static void halfbutterfly(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i > n) ? (2 * n - i) : i; // Determine the number of stars

            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }

    static void butterfly(int n) {
        int initsp = 2 * n - 2;

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i > n) ? (2 * n - i) : i;
            /// stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            /// spaces
            for (int j = 1; j <= initsp; j++) {
                System.out.print(" ");
            }
            ///  stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) initsp -= 2;
            else initsp += 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        //halfbutterfly(n);
        butterfly(n);

    }
}
