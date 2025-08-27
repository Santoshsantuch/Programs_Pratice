package com.learning.linkedlist;

import java.util.Scanner;

public class MycustomLinkedlist {

    Node head;

    public void insert(int ele) {
        Node newNode = new Node(ele);

        if (head == null) {
            head = newNode;
            return ;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");

            temp = temp.next;
        }
        System.out.println();
    }

        public void deletehead () {
            if (head == null) {
                return;
            }
            head = head.next;
        }

        public void deletetail(){
        if(head==null||head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        }

        public void deletemiddle(){
            if(head==null){
                return;
            }
            Node slow=head;
            Node fast=head;
            Node prev=null;
            while(fast!=null &&fast.next!=null){
                prev=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            delete10Nodesafterele1(prev.data);

        }

        public void deletekth(int k){
        if(head==null){
            return;
        }
        if(k==1) head=head.next;
        Node temp=head;
        int count=1; /// if we want 0 based index means count should be starts from 0
            /// count=1 means 1 based indexing;
        Node prev=null;
        while(temp!=null&&count<k){
            prev=temp;
            temp=temp.next;
            count++;

        }
        prev.next=temp.next;
        }

        public void deleteele(int ele){
        if(head.data==ele){
            head=head.next;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==ele){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        }


    public void delete10Nodesafterele1(int ele) {
        Node temp = head;

        // Find the node with data == ele
        while (temp != null && temp.data != ele) {
            temp = temp.next;
        }
        // If not found, do nothing
        if (temp == null) {
            return;
        }

        Node current = temp.next;
        int count = 0;

        // Skip up to 10 nodes
        while (current != null && count < 4) {
            current = current.next;
            count++;
        }

        // Connect the found node to the node after the 10 deleted nodes
        temp.next = current;
    }

    public void reverse(){
        Node newhead = null;
        Node temp = head;
        while(temp!=null){
            Node next=temp.next;
            temp.next=newhead;
            newhead = temp;
            temp=next;
        }
        head= newhead;
    }



    public static void main(String[] args) {

        MycustomLinkedlist list = new MycustomLinkedlist();
        Scanner sc = new Scanner(System.in);
        int n = 8;
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            list.insert(ele);
        }

        list.reverse();
        list.display();
//
//        list.deletehead();
//        list.display();
//        list.deletetail();
//        list.display();


    }
}
//public void delete10Nodesafterele(int ele){
//    Node temp=head;
//    Node prev=null;
//    int count=0;
//    while(temp!=null){
//        if(temp.data==ele) {
//            count = 0;
//            prev=temp;
//        }if(count>10){
//            break;
//        }
//        count+=1;
//        temp=temp.next;
//    }
//    if(count<=10){
//        prev.next=null;
//    } else{
//        prev.next=temp;
//    }
//
//}