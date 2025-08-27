package com.learning.patterns;

import java.util.Scanner;

public class AllPatternPrograms {

    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i=n-1;i>=0;i--){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            // ch='A'+i;
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++; //optional it is when I use above commented line
        }
    }

    public static void pattern4(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");

            }
            char ch='A';

            for(int j=1;j<=2*i-1;j++){

                System.out.print(ch+" ");
                if(j< i) ch++;
                else ch--;
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern5(n);
    }
}
