package com.learning.patterns;

public class Pattern_2 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }

    }
}
