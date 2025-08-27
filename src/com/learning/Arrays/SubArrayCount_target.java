package com.learning.Arrays;

public class SubArrayCount_target {
    private static int countSubArray(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int curr_sum=0;
            for(int j=i;j<arr.length;j++){
                curr_sum+=arr[j];
                if(curr_sum==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
        int target=6;
        int res=countSubArray(arr,target);
        System.out.println(res);

    }
}
