package com.learning.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd_Start_Brute {

    static int[] move_zeros(int[] arr) {
        int n= arr.length;
        List<Integer> temp = new ArrayList<>();

        /// Step 1 : Insert Non Zeros elements into a temp array
        /// It is same for moving zeros to end or start
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        /// Step 2 : Fill beginning with non zeros elements (END)
        for(int i=0;i<temp.size();i++){
         arr[i]=temp.get(i);
        }
        /// Step 2 : Fill beginning with zeros
        for (int i = 0; i < n - temp.size(); i++) {
            arr[i] = 0;
        }
        /// Step 3 : Fill the rem elements with zeros
        for(int i= temp.size();i<n;i++){
            arr[i]=0;
        }
       /// Step 3 : Add non-zero elements in reverse order at the end
        for (int i = temp.size() - 1, j = n - 1; i >= 0; i--, j--) {
            arr[j] = temp.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={0,9,0,7,8,2};
        int[] res=move_zeros(arr);
        System.out.println(Arrays.toString(res));
    }
}
