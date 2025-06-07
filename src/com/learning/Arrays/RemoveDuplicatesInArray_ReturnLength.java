package com.learning.Arrays;

public class RemoveDuplicatesInArray_ReturnLength {

    private static int removedup(int[] arr){

        /// int j=1;
        ///      for(int i=1;i<nums.length;i++){
        ///         if(nums[i]!=nums[i-1]){
        ///             nums[j]=nums[i];
        ///             j++;
        ///         }
        ///      }
        ///      return j;

        
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,6,5,4,4,3};
        int len=removedup(arr);
        System.out.println(len);
    }
}
