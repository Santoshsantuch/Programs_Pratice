package com.learning.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfTwoSortedArrays {

    private static List<Integer> intersectionBrute(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] visited = new int[arr2.length];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]&&visited[j]==0){
                    ans.add(arr1[i]);
                    visited[j]=1;
                    break;
                }
                if(arr2[j]>arr1[i]) break;
            }
        }
        return ans;
    }

    private static List<Integer> intersectionOpt(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i=0,j=0;
        List<Integer> ans = new ArrayList<>();

        while(i<n1&&j<n2){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr1[i]){
                j++;
            }else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        List<Integer> res = intersectionBrute(arr1, arr2);
        System.out.println(res);
    }
}
