package com.learning.patterns;

public class Pattern_6 {
    public static void main(String[] args) {
        int n = 6;

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part of the diamond
        for (int i = n - 2; i >= 0; i--) {
            // Leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
