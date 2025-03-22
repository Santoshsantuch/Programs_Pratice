package com.learning.linkedlist;

class Node{
    int data;
    Node next;

    Node(int data,Node next1){
        this.data=data;
        this.next=next1;

    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}