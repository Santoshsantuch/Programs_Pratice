package com.learning.patterns;


    public class PascalsTriangle {
        public static void main(String[] args) {
            int n = 7;
            for (int i = 0; i < n; i++) {
                int num = 1;
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    num = num * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
    }
