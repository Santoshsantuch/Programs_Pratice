package com.learning.linkedlist;

import java.util.Scanner;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList1 {
    Node1 head;

    // Add element at the end
    void add(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


    public int sum() {
        int total = 0;
        Node1 temp = head;
        while (temp != null) {
            total += temp.data;
            temp = temp.next;
        }
        return total;
    }
}

public class Custom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList1 list = new MyLinkedList1();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            list.add(ele);
        }
        int res = list.sum();
        System.out.println(res);
    }
}

