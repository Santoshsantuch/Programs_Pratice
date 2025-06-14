package com.learning.patterns;

public class Pattern_8 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i > n) ? (2 * n - i) : i; // Determine the number of stars

            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
}
