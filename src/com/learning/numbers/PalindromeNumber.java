package com.learning.numbers;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem,res=0;
        while(num>0){
            rem=num%10;
            res=(res*10)+rem;
            num=num/10;
        }
        System.out.println(res);
    }

}
