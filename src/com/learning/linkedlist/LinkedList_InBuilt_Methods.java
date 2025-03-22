package com.learning.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_InBuilt_Methods {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedList<Integer> ll=new LinkedList<>();

        for(int i=0;i<5;i++){
            ll.add(sc.nextInt());
        }

        ll.removeFirst();
        ll.removeLast();
        ll.remove(2);
        ll.removeLastOccurrence("santhu");
        System.out.println(ll);

    }
}
