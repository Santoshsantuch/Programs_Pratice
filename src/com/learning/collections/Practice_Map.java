package com.learning.collections;

import java.util.HashMap;
import java.util.Map;

public class Practice_Map {
    public static void main(String[] args) {

        Map<String,Integer> students=new HashMap<>();
        students.put("santhu",100);
        students.put("surya",99);
        students.put("mani",100);
        students.put("santhu",101);

        System.out.println(students.keySet());

        for(String key :students.keySet()){
            System.out.println(key+" "+students.get(key));

        }
    }
}
