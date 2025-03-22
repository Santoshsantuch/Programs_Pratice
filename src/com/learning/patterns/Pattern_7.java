package com.learning.patterns;

public class Pattern_7 {
    public static void main(String[] args) {
        int n = 5;

        // Inverted pyramid pattern
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
}
