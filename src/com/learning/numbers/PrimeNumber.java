package com.learning.numbers;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class PrimeNumber {

    private static boolean isprime(int n){
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
                if(n%i!=i){
                    cnt++;
                }
            }
        }
        if(cnt==2) return true;

        return false;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean res=isprime(n);
    System.out.println(res);
}
}

