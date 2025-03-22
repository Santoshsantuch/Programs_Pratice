package com.learning.Arrays;

import java.util.Scanner;

public class largest_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={15,25,35,85,56};
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        System.out.println(largest);
    }
}
