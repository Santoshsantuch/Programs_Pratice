package com.learning.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Majority_ele_Using_HashMap {

    // for (Map.Entry<String, Integer> e : map.entrySet())
    //            System.out.println("Key: " + e.getKey()
    //                               + " Value: " + e.getValue());
    //    }
    //        for(int ele:arr) {
//            if (map.containsKey(arr[ele])) {
//                map.put(arr[ele], map.get(arr[ele]) + 1);
//
//            } else {
//                map.put(arr[ele], 1);
//
//            }
//        }
    static int majority_Hashmap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
            if (map.get(ele) > arr.length / 2) {
                return ele;
            }

        }
        System.out.println(map);
        return -1;
    }
    //// Looping round HashMap
    //        for(Map.Entry<Integer,Integer> e: map.entrySet()){
//                if(e.getValue()>arr.length/2){
//                    return e.getKey();
//                }
//        }
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 2, 2, 1, 0};
        int var = majority_Hashmap(arr);
        System.out.println(var);
    }
}


