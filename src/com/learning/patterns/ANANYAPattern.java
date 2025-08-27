package com.learning.patterns;

public class ANANYAPattern {

        public static void main(String[] args) {
            int n = 5; // size of each letter

            for (int i = 0; i < n; i++) {
                // A
                for (int j = 0; j < n; j++) {
                    if ((j == 0 || j == n - 1) && i != 0 ||
                            i == 0 && j != 0 && j != n - 1 ||
                            i == n / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");

                // N
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");

                // A
                for (int j = 0; j < n; j++) {
                    if ((j == 0 || j == n - 1) && i != 0 ||
                            i == 0 && j != 0 && j != n - 1 ||
                            i == n / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");

                // N
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");

                // Y
                for (int j = 0; j < n; j++) {
                    if ((i <= n / 2 && (j == i || j == n - i - 1)) ||
                            (i > n / 2 && j == n / 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");

                // A
                for (int j = 0; j < n; j++) {
                    if ((j == 0 || j == n - 1) && i != 0 ||
                            i == 0 && j != 0 && j != n - 1 ||
                            i == n / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }
    }


