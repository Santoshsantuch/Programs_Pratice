package com.learning.Arrays;

import java.util.Arrays;

public class SubarrayWithSumReturnIndicies {
    private static int[] sub(int[] arr,int subsum){
      int n= arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==subsum){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr={1,4,20,3,10,5};
        int target=33;
        int[] res=sub(arr,target);
        System.out.println(Arrays.toString(res));
    }
}
