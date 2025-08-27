package com.learning.Arrays;

import java.util.*;

public class UnionOfTwoArrays_Brute {

    private static int[] unionBrute(int[] arr1,int[] arr2){

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

    private static List<Integer> unionOpt(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        List<Integer> UnionArr = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (UnionArr.isEmpty() || UnionArr.get(UnionArr.size() - 1) != arr1[i])
                    UnionArr.add(arr1[i]);
                i++;
            }
            else {
                if (UnionArr.isEmpty() || UnionArr.get(UnionArr.size() - 1) != arr2[j])
                    UnionArr.add(arr2[j]);
                j++;
            }
        }

        while (i < n1) // IF any element left in arr1
        {
            if (UnionArr.get(UnionArr.size() - 1) != arr1[i])
                UnionArr.add(arr1[i]);
            i++;
        }
        while (j < n2) // If any elements left in arr2
        {
            if (UnionArr.get(UnionArr.size() - 1) != arr2[j])
                UnionArr.add(arr2[j]);
            j++;
        }
        return UnionArr;

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
        int[] res = unionBrute(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}
