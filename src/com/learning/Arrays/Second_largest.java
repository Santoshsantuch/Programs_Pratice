package com.learning.Arrays;

public class Second_largest {

    static int secondlargest(int[] arr) {
        int Largest = Integer.MIN_VALUE;
        int Second_largest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > Largest) {
                Second_largest = Largest;
                Largest = num;
            } else if (num > Second_largest && num < Largest) {
                Second_largest = num;
            }
        }
        if (Second_largest == Integer.MIN_VALUE) {
            return -1;
        }
        return Second_largest;
    }

        public static void main (String[]args){
            int[] arr = {15,20,68,12,10,5};
            int res=secondlargest(arr);
            System.out.println(res);
        }

}
