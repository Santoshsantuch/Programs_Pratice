package com.learning.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SeperateNegAndPosValues {
    private static int[] seperate(int[] arr){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> negs=new ArrayList<>();
        for(int i:arr){
            if(i>0){
                pos.add(i);
            }else{
                negs.add(i);
            }
        }
        int posindex=0,negindex=0;
        for(int i=0;i<arr.length;i++){
            if(negindex<negs.size()){
                arr[i]=negs.get(negindex++);

            }else{
                arr[i]=pos.get(posindex++);
            }

        }
        return arr;
    }
//        int count=0;
//        for(int i=0;i<negs.size();i++){
//            arr[i]=negs.get(i);
//            count++;
//        }
//        int j=0;
//        for(int i=count;i< arr.length;i++){
//            arr[i]=pos.get(j++);
//        }

    public static void main(String[] args) {
        int[] arr={1,-2,3,-4,5,-6,7,-8,9,-10};
        int[] res=seperate(arr);
        System.out.println(Arrays.toString(res));

    }
}
