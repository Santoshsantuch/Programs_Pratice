package com.learning.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/// STRIVER
/// T.C = O(N+d);
/// S.C = O(d);
public class LeftRotateArrByDPlaces_Brute {
    private static int[] leftRotateBy_D_Places(int[] arr,int n,int d){
        List<Integer> temp=new ArrayList<>();

        for(int i=1;i<=d;i++){
            temp.add(i);
        }

        System.out.println(temp);
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]= temp.get(i - (n - d));
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=leftRotateBy_D_Places(arr,n,d);
        System.out.println(Arrays.toString(res));
    }
}

