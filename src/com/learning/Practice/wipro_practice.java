package com.learning.Practice;

import java.util.Scanner;

public class wipro_practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int first=2,last=20,count=0;
        for(int i=first;i<=last;i++){
            if(i%first==0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
