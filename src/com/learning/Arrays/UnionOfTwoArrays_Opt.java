package com.learning.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UnionOfTwoArrays_Opt {
    private static List<Integer> union(int[] arr1, int[] arr2) {
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
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        List<Integer> res = union(arr1, arr2);
        System.out.println(res);
    }
}
