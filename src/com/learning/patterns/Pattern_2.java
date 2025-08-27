package com.learning.patterns;

/// 12345
/// 1234
/// 123
/// 12
/// 1
public class Pattern_2 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to next line
        }

    }
}
