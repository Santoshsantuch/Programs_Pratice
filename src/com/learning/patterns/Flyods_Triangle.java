package com.learning.patterns;

public class Flyods_Triangle {
    public static void main(String[] args) {
        int n=5,num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
