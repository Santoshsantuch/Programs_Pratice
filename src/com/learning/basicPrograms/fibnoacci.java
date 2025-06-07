package com.learning.basicPrograms;

import java.util.Scanner;

public class fibnoacci {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1=0,n2=1;
    int n3;
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        System.out.println(n1);
        n3=n1+n2;
        n1=n2;
        n2=n3;
    }

    }
}
