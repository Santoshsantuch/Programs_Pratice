package com.learning.Arrays;

import java.util.Scanner;

public class ThreeConsecutiveOdds {
    private static boolean threeConsecutiveOdds(int[] arr) {
        int max=0,count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                count+=1;
                max=Math.max(max,count);
                if(max==3) break;
            }else{
                count=0;
            }
        }
        if(max==3){
            return true;
        }
        return false;
    }

    public boolean threeConsecutiveOddsA(int[] arr) {
        // Loop through the array up to the third-to-last element
        for (int i = 0; i < arr.length - 2; i++) {
            // Check if the current element and the next two elements are all odd
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean res = threeConsecutiveOdds(arr);
        System.out.println(res);
    }
}
