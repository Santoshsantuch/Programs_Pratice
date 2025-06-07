package com.learning.Arrays;
import java.util.Arrays;

public class RemoveFirstOccurrence {
        public static void main(String[] args) {
            int[] arr = {1, 5, 4, 8, 3, 6, 3};
            int val = 3;
            int[] result = removeFirstOccurrence(arr, val);
            System.out.println(Arrays.toString(result));
        }

        public static int[] removeFirstOccurrence(int[] arr, int val) {
            int index = -1;

            // Find the first occurrence index of val
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == val) {
                    index = i;
                    break;
                }
            }

            // If val is not found, return the same array
            if (index == -1) {
                return arr;
            }
            // Create a new array without the first occurrence of val
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[j++] = arr[i];
                }
            }

            return newArr;
        }
    }


