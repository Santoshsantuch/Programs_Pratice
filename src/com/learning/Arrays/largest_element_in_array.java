package com.learning.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class largest_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={15,25,35,85,56};
        int largest=Integer.MIN_VALUE;
        ///  Brute Force
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        for(int i : arr){
            if(i>largest){
                largest=i;
            }
        }
        System.out.println(largest);
    }
}
