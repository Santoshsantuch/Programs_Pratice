package com.learning.collections;

import java.util.*;

public class Collections_Practice_Set {
    public static void main(String[] args) {

        // Set<Integer> nums=new TreeSet<>();
        Set<Integer> nums=new HashSet<>();
        nums.add(5);
        nums.add(538);
        nums.add(52);
        nums.add(1);
        nums.add(514);
        nums.add(25);

        Iterator<Integer> values=nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
        System.out.println(nums);


    }
}
