package com.learning.Arrays;

import java.util.Scanner;

public class Is_Sorted_or_not {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = {1,1,1,2};

        System.out.println(isSorted(a.length, a));
    }
         static boolean isSorted (int n, int[] a) {
             // Write your code here.
             for (int i = 1; i < a.length; i++) {
                 if (a[i] < a[i - 1]) {
                     return false;
                 }
             }
             return true;
         }

         }

