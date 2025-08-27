package com.learning.Arrays;

import java.util.*;
import java.util.List;

public class Leaders {

    private static ArrayList<Integer> leaderBrute(int[] arr){

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader=true;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] < arr[j]) {
                    leader=false;
                    break;
                }
            }
            if(leader){
                list.add(arr[i]);
            }

        }
        Collections.sort(list);

        return list;
    }

    private static ArrayList<Integer> leadersOpt(int[] arr){
        int n=arr.length;
        int max=arr[n-1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={1,25,12,1,6,5,7};
        List<Integer> res = leaderBrute(arr);
        System.out.println(res);
    }
}
