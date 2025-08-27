package com.learning.Arrays;

import java.util.Scanner;

public class MajorityElement {

    private static int majority_ele(int[] arr, int half_length) {
        for (int j : arr) {
            int count = 0;
            for (int k : arr) {
                if (j == k) {
                    count++;
                }
            }
            if (count > half_length) {
                return j;
            }
        }
        return -1;
    }

    private static int MooresVotingAlgorithmOpt(int[] arr,int len) {
        int count=0;
        int res=-1;
        for(int ele : arr){
            if(count==0){

                res=ele;
            }
            count+=(res == ele) ? 1 : -1;
        }
        /// Verifying the res element is majority ele or not
        count=0;
        for(int ele :arr){
            if(ele==res){
                count++;
            }
        }
        if(count > len){
            return res;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1, 2, 5, 1, 2};
        int half_length=arr.length/2;
        int res=MooresVotingAlgorithmOpt(arr, half_length);
        System.out.println(res);

    }
}
