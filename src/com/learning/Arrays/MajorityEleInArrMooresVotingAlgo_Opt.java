package com.learning.Arrays;

public class MajorityEleInArrMooresVotingAlgo_Opt {

    static int majority_MooresVotingAlgo(int[] arr) {
        int res=arr[0],count=0;
        for(int ele : arr){
            if(count==0){
                res=ele;
            }
            else if(ele==res){
                count++;
            }else{
                count--;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 2, 2, 1, 0};
        int var = majority_MooresVotingAlgo(arr);
        System.out.println(var);
    }
}
