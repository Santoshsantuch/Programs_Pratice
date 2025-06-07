package com.learning.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoArrays_Brute {
    private static int[] union(int[] arr1,int[] arr2){

        Set<Integer> set=new TreeSet<>();
        for(int i: arr1){
            set.add(i);
        }for(int i: arr2){
            set.add(i);
        }
        int[] union= new int[set.size()];
        int i=0;
        for(int j : set){
            union[i++]=j;
        }
        return union;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2=sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] res = union(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}
